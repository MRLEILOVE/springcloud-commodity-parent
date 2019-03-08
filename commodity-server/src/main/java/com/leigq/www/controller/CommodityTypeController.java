package com.leigq.www.controller;

import com.leigq.www.common.CommodityType;
import com.leigq.www.service.CommodityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *  商品类型
 * <p>
 * 创建人：asus <br>
 * 创建时间：2019-02-15 15:39 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@RestController
public class CommodityTypeController {

    @Autowired
    private CommodityTypeService commodityTypeService;


    @GetMapping("/commodity_types")
    public List<CommodityType> listCommodityTypes() {
        return null;
    }

}
