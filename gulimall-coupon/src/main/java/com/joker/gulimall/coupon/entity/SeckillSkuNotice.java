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
 * ??ɱ??Ʒ֪ͨ???
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("sms_seckill_sku_notice")
@Schema(name = "SeckillSkuNotice", description = "$!{table.comment}")
public class SeckillSkuNotice extends Model<SeckillSkuNotice> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "member_id")
    @TableField("member_id")
    private Long memberId;

    @Schema(description = "sku_id")
    @TableField("sku_id")
    private Long skuId;

    @Schema(description = "?????id")
    @TableField("session_id")
    private Long sessionId;

    @Schema(description = "????ʱ?")
    @TableField("subcribe_time")
    private Date subcribeTime;

    @Schema(description = "????ʱ?")
    @TableField("send_time")
    private Date sendTime;

    @Schema(description = "֪ͨ??ʽ[0-???ţ?1-?ʼ")
    @TableField("notice_type")
    private Boolean noticeType;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
