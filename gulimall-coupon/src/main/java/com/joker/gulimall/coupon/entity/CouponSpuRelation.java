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
 * ?Ż?ȯ????Ʒ????
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("sms_coupon_spu_relation")
@Schema(name = "CouponSpuRelation", description = "$!{table.comment}")
public class CouponSpuRelation extends Model<CouponSpuRelation> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "?Ż?ȯid")
    @TableField("coupon_id")
    private Long couponId;

    @Schema(description = "spu_id")
    @TableField("spu_id")
    private Long spuId;

    @Schema(description = "spu_name")
    @TableField("spu_name")
    private String spuName;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
