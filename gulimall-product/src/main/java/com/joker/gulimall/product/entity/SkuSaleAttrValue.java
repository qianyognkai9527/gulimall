package com.joker.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * sku????????&ֵ
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Getter
@Setter
@TableName("pms_sku_sale_attr_value")
@Schema(name = "SkuSaleAttrValue", description = "$!{table.comment}")
public class SkuSaleAttrValue extends Model<SkuSaleAttrValue> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "sku_id")
    @TableField("sku_id")
    private Long skuId;

    @Schema(description = "attr_id")
    @TableField("attr_id")
    private Long attrId;

    @Schema(description = "?????????")
    @TableField("attr_name")
    private String attrName;

    @Schema(description = "????????ֵ")
    @TableField("attr_value")
    private String attrValue;

    @Schema(description = "˳?")
    @TableField("attr_sort")
    private Integer attrSort;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
