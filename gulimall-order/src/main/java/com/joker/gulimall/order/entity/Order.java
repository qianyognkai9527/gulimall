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
 * ????
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("oms_order")
@Schema(name = "Order", description = "$!{table.comment}")
public class Order extends Model<Order> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "member_id")
    @TableField("member_id")
    private Long memberId;

    @Schema(description = "?????")
    @TableField("order_sn")
    private String orderSn;

    @Schema(description = "ʹ?õ??Ż?ȯ")
    @TableField("coupon_id")
    private Long couponId;

    @Schema(description = "create_time")
    @TableField("create_time")
    private Date createTime;

    @Schema(description = "?û??")
    @TableField("member_username")
    private String memberUsername;

    @Schema(description = "?????ܶ")
    @TableField("total_amount")
    private BigDecimal totalAmount;

    @Schema(description = "Ӧ???ܶ")
    @TableField("pay_amount")
    private BigDecimal payAmount;

    @Schema(description = "?˷ѽ")
    @TableField("freight_amount")
    private BigDecimal freightAmount;

    @Schema(description = "?????Ż?????????ۡ??????????ݼۣ?")
    @TableField("promotion_amount")
    private BigDecimal promotionAmount;

    @Schema(description = "???ֵֿ۽")
    @TableField("integration_amount")
    private BigDecimal integrationAmount;

    @Schema(description = "?Ż?ȯ?ֿ۽")
    @TableField("coupon_amount")
    private BigDecimal couponAmount;

    @Schema(description = "??̨????????ʹ?õ??ۿ۽")
    @TableField("discount_amount")
    private BigDecimal discountAmount;

    @Schema(description = "֧????ʽ??1->֧??????2->΢?ţ?3->?????? 4->?????????")
    @TableField("pay_type")
    private Byte payType;

    @Schema(description = "??????Դ[0->PC??????1->app????]")
    @TableField("source_type")
    private Byte sourceType;

    @Schema(description = "????״̬??0->?????1->????????2->?ѷ?????3->?????ɣ?4->?ѹرգ?5->??Ч??????")
    @TableField("status")
    private Byte status;

    @Schema(description = "??????˾(???ͷ?ʽ)")
    @TableField("delivery_company")
    private String deliveryCompany;

    @Schema(description = "???????")
    @TableField("delivery_sn")
    private String deliverySn;

    @Schema(description = "?Զ?ȷ??ʱ?䣨?죩")
    @TableField("auto_confirm_day")
    private Integer autoConfirmDay;

    @Schema(description = "???Ի??õĻ")
    @TableField("integration")
    private Integer integration;

    @Schema(description = "???Ի??õĳɳ?ֵ")
    @TableField("growth")
    private Integer growth;

    @Schema(description = "??Ʊ????[0->??????Ʊ??1->???ӷ?Ʊ??2->ֽ?ʷ?Ʊ]")
    @TableField("bill_type")
    private Byte billType;

    @Schema(description = "??Ʊ̧ͷ")
    @TableField("bill_header")
    private String billHeader;

    @Schema(description = "??Ʊ???")
    @TableField("bill_content")
    private String billContent;

    @Schema(description = "??Ʊ?˵绰")
    @TableField("bill_receiver_phone")
    private String billReceiverPhone;

    @Schema(description = "??Ʊ?????")
    @TableField("bill_receiver_email")
    private String billReceiverEmail;

    @Schema(description = "?ջ??????")
    @TableField("receiver_name")
    private String receiverName;

    @Schema(description = "?ջ??˵绰")
    @TableField("receiver_phone")
    private String receiverPhone;

    @Schema(description = "?ջ????ʱ")
    @TableField("receiver_post_code")
    private String receiverPostCode;

    @Schema(description = "ʡ??/ֱϽ?")
    @TableField("receiver_province")
    private String receiverProvince;

    @Schema(description = "???")
    @TableField("receiver_city")
    private String receiverCity;

    @Schema(description = "?")
    @TableField("receiver_region")
    private String receiverRegion;

    @Schema(description = "??ϸ??ַ")
    @TableField("receiver_detail_address")
    private String receiverDetailAddress;

    @Schema(description = "??????ע")
    @TableField("note")
    private String note;

    @Schema(description = "ȷ???ջ?״̬[0->δȷ?ϣ?1->??ȷ??]")
    @TableField("confirm_status")
    private Byte confirmStatus;

    @Schema(description = "ɾ??״̬??0->δɾ????1->??ɾ?")
    @TableField("delete_status")
    private Byte deleteStatus;

    @Schema(description = "?µ?ʱʹ?õĻ")
    @TableField("use_integration")
    private Integer useIntegration;

    @Schema(description = "֧??ʱ?")
    @TableField("payment_time")
    private Date paymentTime;

    @Schema(description = "????ʱ?")
    @TableField("delivery_time")
    private Date deliveryTime;

    @Schema(description = "ȷ???ջ?ʱ?")
    @TableField("receive_time")
    private Date receiveTime;

    @Schema(description = "????ʱ?")
    @TableField("comment_time")
    private Date commentTime;

    @Schema(description = "?޸?ʱ?")
    @TableField("modify_time")
    private Date modifyTime;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
