package com.joker.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * ?Ż?ȯ??ȡ??ʷ??¼
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("sms_coupon_history")
@Schema(name = "CouponHistory", description = "$!{table.comment}")
public class CouponHistory extends Model<CouponHistory> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "?Ż?ȯid")
    @TableField("coupon_id")
    private Long couponId;

    @Schema(description = "??Աid")
    @TableField("member_id")
    private Long memberId;

    @Schema(description = "??Ա?")
    @TableField("member_nick_name")
    private String memberNickName;

    @Schema(description = "??ȡ??ʽ[0->??̨???ͣ?1->??????ȡ]")
    @TableField("get_type")
    private Boolean getType;

    @Schema(description = "????ʱ?")
    @TableField("create_time")
    private Date createTime;

    @Schema(description = "ʹ??״̬[0->δʹ?ã?1->??ʹ?ã?2->?ѹ???]")
    @TableField("use_type")
    private Boolean useType;

    @Schema(description = "ʹ??ʱ?")
    @TableField("use_time")
    private Date useTime;

    @Schema(description = "????id")
    @TableField("order_id")
    private Long orderId;

    @Schema(description = "?????")
    @TableField("order_sn")
    private Long orderSn;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
