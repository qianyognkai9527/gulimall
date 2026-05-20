package com.joker.gulimall.order.entity;

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
 * ֧????Ϣ?
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("oms_payment_info")
@Schema(name = "PaymentInfo", description = "$!{table.comment}")
public class PaymentInfo extends Model<PaymentInfo> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "?????ţ?????ҵ???ţ?")
    @TableField("order_sn")
    private String orderSn;

    @Schema(description = "????id")
    @TableField("order_id")
    private Long orderId;

    @Schema(description = "֧??????????ˮ?")
    @TableField("alipay_trade_no")
    private String alipayTradeNo;

    @Schema(description = "֧???ܽ")
    @TableField("total_amount")
    private BigDecimal totalAmount;

    @Schema(description = "???????")
    @TableField("subject")
    private String subject;

    @Schema(description = "֧??״̬")
    @TableField("payment_status")
    private String paymentStatus;

    @Schema(description = "????ʱ?")
    @TableField("create_time")
    private Date createTime;

    @Schema(description = "ȷ??ʱ?")
    @TableField("confirm_time")
    private Date confirmTime;

    @Schema(description = "?ص????")
    @TableField("callback_content")
    private String callbackContent;

    @Schema(description = "?ص?ʱ?")
    @TableField("callback_time")
    private Date callbackTime;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
