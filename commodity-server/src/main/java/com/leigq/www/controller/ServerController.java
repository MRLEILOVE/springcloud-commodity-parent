package com.leigq.www.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
public class ServerController {

    @GetMapping("/messages")
    public String getMsg() {
        return "调用商品服务1成功。。。";
    }

}
