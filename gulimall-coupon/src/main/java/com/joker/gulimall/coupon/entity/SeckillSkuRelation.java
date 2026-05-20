package com.joker.gulimall.coupon.entity;

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
 * ??ɱ???Ʒ????
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("sms_seckill_sku_relation")
@Schema(name = "SeckillSkuRelation", description = "$!{table.comment}")
public class SeckillSkuRelation extends Model<SeckillSkuRelation> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "?id")
    @TableField("promotion_id")
    private Long promotionId;

    @Schema(description = "?????id")
    @TableField("promotion_session_id")
    private Long promotionSessionId;

    @Schema(description = "??Ʒid")
    @TableField("sku_id")
    private Long skuId;

    @Schema(description = "??ɱ?۸")
    @TableField("seckill_price")
    private Long seckillPrice;

    @Schema(description = "??ɱ????")
    @TableField("seckill_count")
    private Long seckillCount;

    @Schema(description = "ÿ???޹??")
    @TableField("seckill_limit")
    private Long seckillLimit;

    @Schema(description = "???")
    @TableField("seckill_sort")
    private Integer seckillSort;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
