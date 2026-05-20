package com.joker.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.math.BigDecimal;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * ??Ʒ??????Ϣ
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("sms_sku_full_reduction")
@Schema(name = "SkuFullReduction", description = "$!{table.comment}")
public class SkuFullReduction extends Model<SkuFullReduction> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "spu_id")
    @TableField("sku_id")
    private Long skuId;

    @Schema(description = "?????")
    @TableField("full_price")
    private BigDecimal fullPrice;

    @Schema(description = "?????")
    @TableField("reduce_price")
    private BigDecimal reducePrice;

    @Schema(description = "?Ƿ??????????Ż")
    @TableField("add_other")
    private Boolean addOther;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
