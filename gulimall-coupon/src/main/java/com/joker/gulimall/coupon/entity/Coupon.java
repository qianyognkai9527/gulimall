package com.joker.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * ?Ż?ȯ??Ϣ
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("sms_coupon")
@Schema(name = "Coupon", description = "$!{table.comment}")
public class Coupon extends Model<Coupon> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "?Żݾ?????[0->ȫ????ȯ??1->??Ա??ȯ??2->??????ȯ??3->ע????ȯ]")
    @TableField("coupon_type")
    private Boolean couponType;

    @Schema(description = "?Ż?ȯͼƬ")
    @TableField("coupon_img")
    private String couponImg;

    @Schema(description = "?Żݾ??")
    @TableField("coupon_name")
    private String couponName;

    @Schema(description = "?")
    @TableField("num")
    private Integer num;

    @Schema(description = "?")
    @TableField("amount")
    private BigDecimal amount;

    @Schema(description = "ÿ?????????")
    @TableField("per_limit")
    private Integer perLimit;

    @Schema(description = "ʹ???ż")
    @TableField("min_point")
    private BigDecimal minPoint;

    @Schema(description = "??ʼʱ?")
    @TableField("start_time")
    private Date startTime;

    @Schema(description = "????ʱ?")
    @TableField("end_time")
    private Date endTime;

    @Schema(description = "ʹ??????[0->ȫ??ͨ?ã?1->ָ?????ࣻ2->ָ????Ʒ]")
    @TableField("use_type")
    private Boolean useType;

    @Schema(description = "??ע")
    @TableField("note")
    private String note;

    @Schema(description = "?????")
    @TableField("publish_count")
    private Integer publishCount;

    @Schema(description = "??ʹ???")
    @TableField("use_count")
    private Integer useCount;

    @Schema(description = "??ȡ?")
    @TableField("receive_count")
    private Integer receiveCount;

    @Schema(description = "??????ȡ?Ŀ?ʼ???")
    @TableField("enable_start_time")
    private Date enableStartTime;

    @Schema(description = "??????ȡ?Ľ??????")
    @TableField("enable_end_time")
    private Date enableEndTime;

    @Schema(description = "?Ż??")
    @TableField("code")
    private String code;

    @Schema(description = "??????ȡ?Ļ?Ա?ȼ?[0->???޵ȼ???????-??Ӧ?ȼ?]")
    @TableField("member_level")
    private Boolean memberLevel;

    @Schema(description = "????״̬[0-δ??????1-?ѷ???]")
    @TableField("publish")
    private Boolean publish;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
