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
 * spu????ֵ
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Getter
@Setter
@TableName("pms_product_attr_value")
@Schema(name = "ProductAttrValue", description = "$!{table.comment}")
public class ProductAttrValue extends Model<ProductAttrValue> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "??Ʒid")
    @TableField("spu_id")
    private Long spuId;

    @Schema(description = "????id")
    @TableField("attr_id")
    private Long attrId;

    @Schema(description = "?????")
    @TableField("attr_name")
    private String attrName;

    @Schema(description = "????ֵ")
    @TableField("attr_value")
    private String attrValue;

    @Schema(description = "˳?")
    @TableField("attr_sort")
    private Integer attrSort;

    @Schema(description = "????չʾ???Ƿ?չʾ?ڽ????ϣ?0-?? 1-?ǡ?")
    @TableField("quick_show")
    private Byte quickShow;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
