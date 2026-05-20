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
 * ??Ʒ???ݼ۸
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("sms_sku_ladder")
@Schema(name = "SkuLadder", description = "$!{table.comment}")
public class SkuLadder extends Model<SkuLadder> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "spu_id")
    @TableField("sku_id")
    private Long skuId;

    @Schema(description = "?????")
    @TableField("full_count")
    private Integer fullCount;

    @Schema(description = "?????")
    @TableField("discount")
    private BigDecimal discount;

    @Schema(description = "?ۺ")
    @TableField("price")
    private BigDecimal price;

    @Schema(description = "?Ƿ??????????Ż?[0-???ɵ??ӣ?1-?ɵ???]")
    @TableField("add_other")
    private Boolean addOther;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
