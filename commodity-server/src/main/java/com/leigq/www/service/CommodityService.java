package com.leigq.www.service;

import com.leigq.www.common.entity.Commodity;
import com.leigq.www.domain.mapper.CommodityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 商品
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
public class CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;

    /**
     * 根据商品id查询商品
     * <br>创建人： leiGQ
     * <br>创建时间： 2019-03-07 16:48
     * <p>
     * 修改人： <br>
     * 修改时间： <br>
     * 修改备注： <br>
     * </p>
     * <br>
     * @param cId 商品id
     * @return 对应id的商品
     */
    public Commodity getCommodities(Long cId) {
        return commodityMapper.selectByPrimaryKey(cId);
    }
}
