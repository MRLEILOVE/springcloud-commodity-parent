package com.leigq.www.common.entity;

import com.leigq.www.common.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商品类型实体
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-03-06 20:40 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CommodityType extends BaseEntity {
    /**
	* 类型名称
	*/
    private String name;
}