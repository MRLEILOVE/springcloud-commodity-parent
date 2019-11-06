package com.leigq.www.service;

import com.leigq.www.common.entity.CommodityType;
import com.leigq.www.domain.mapper.CommodityTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品类型
 * <p>
 * 创建人：asus <br>
 * 创建时间：2019-02-15 15:39 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@Service
@Transactional
public class CommodityTypeService {

    @Autowired
    private CommodityTypeMapper commodityTypeMapper;

    /**
     * 查询商品类型列表
     * <p>
     * 创建人：LeiGQ <br>
     * 创建时间：2019/4/25 22:27 <br>
     * <p>
     * 修改人： <br>
     * 修改时间： <br>
     * 修改备注： <br>
     * </p>
     */
    public List<CommodityType> listCommodityTypes() {
        return commodityTypeMapper.listCommodityTypes();
    }

}
