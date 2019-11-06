package com.leigq.www.controller;

import com.leigq.www.vo.PostFeignTestVO;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * restTemplate、Feign 远程调用服务端简单测试
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-03-07 13:47 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@RestController
@Slf4j
// 处理整个类中的方法异常回调
//@DefaultProperties(defaultFallback = "defaultFallback")
public class ServerController {

    // 超时配置
//    @HystrixCommand(fallbackMethod = "fallback", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
//    })
    //@HystrixCommand // 不加属性使用默认回调，不可直接不写，不写报错
    // 断路器， 下面都是使用的默认值配置
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "20"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50")
    })
    @GetMapping("/messages")
//    @HystrixCommand()
    public String getMsg() {
        // 测试异常调用回滚方法
//        int a = 1 / 0;

        // 测试超时时间
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        return "调用商品服务1成功。。。";
    }

    // 上面方法出错后调用此回调方法
    public String fallback() {
        return "fallback 请求人数太多，请稍候重试!";
    }

    public String defaultFallback() {
        return "defaultFallback 请求人数太多，请稍候重试!";
    }

    /**
     * Feign 远程调用 POST 请求测试
     * @param postFeignTestVO {@link PostFeignTestVO}
     */
    @PostMapping("/postFeignTest")
    public PostFeignTestVO postFeignTest(@RequestBody PostFeignTestVO postFeignTestVO) {
        log.warn("postFeignTest 远程调用成功 success [{}]", postFeignTestVO);
        return postFeignTestVO;
    }


}
