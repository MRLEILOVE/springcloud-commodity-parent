package com.leigq.www.domain.mapper;

import com.leigq.www.common.entity.CommodityType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 商品类型
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-03-06 20:40 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@Mapper
public interface CommodityTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommodityType record);

    int insertSelective(CommodityType record);

    CommodityType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommodityType record);

    int updateByPrimaryKey(CommodityType record);

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
    List<CommodityType> listCommodityTypes();
}