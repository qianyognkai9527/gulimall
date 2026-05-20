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
 * ?????˻????
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("oms_order_return_apply")
@Schema(name = "OrderReturnApply", description = "$!{table.comment}")
public class OrderReturnApply extends Model<OrderReturnApply> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "order_id")
    @TableField("order_id")
    private Long orderId;

    @Schema(description = "?˻???Ʒid")
    @TableField("sku_id")
    private Long skuId;

    @Schema(description = "???????")
    @TableField("order_sn")
    private String orderSn;

    @Schema(description = "????ʱ?")
    @TableField("create_time")
    private Date createTime;

    @Schema(description = "??Ա?û??")
    @TableField("member_username")
    private String memberUsername;

    @Schema(description = "?˿??")
    @TableField("return_amount")
    private BigDecimal returnAmount;

    @Schema(description = "?˻??????")
    @TableField("return_name")
    private String returnName;

    @Schema(description = "?˻??˵绰")
    @TableField("return_phone")
    private String returnPhone;

    @Schema(description = "????״̬[0->????????1->?˻??У?2->?????ɣ?3->?Ѿܾ")
    @TableField("status")
    private Boolean status;

    @Schema(description = "????ʱ?")
    @TableField("handle_time")
    private Date handleTime;

    @Schema(description = "??ƷͼƬ")
    @TableField("sku_img")
    private String skuImg;

    @Schema(description = "??Ʒ?")
    @TableField("sku_name")
    private String skuName;

    @Schema(description = "??ƷƷ?")
    @TableField("sku_brand")
    private String skuBrand;

    @Schema(description = "??Ʒ????????(JSON)")
    @TableField("sku_attrs_vals")
    private String skuAttrsVals;

    @Schema(description = "?˻??")
    @TableField("sku_count")
    private Integer skuCount;

    @Schema(description = "??Ʒ???")
    @TableField("sku_price")
    private BigDecimal skuPrice;

    @Schema(description = "??Ʒʵ??֧?????")
    @TableField("sku_real_price")
    private BigDecimal skuRealPrice;

    @Schema(description = "ԭ?")
    @TableField("reason")
    private String reason;

    @Schema(description = "???")
    @TableField("description?")
    private String description;

    @Schema(description = "ƾ֤ͼƬ???Զ??Ÿ")
    @TableField("desc_pics")
    private String descPics;

    @Schema(description = "??????ע")
    @TableField("handle_note")
    private String handleNote;

    @Schema(description = "??????Ա")
    @TableField("handle_man")
    private String handleMan;

    @Schema(description = "?ջ")
    @TableField("receive_man")
    private String receiveMan;

    @Schema(description = "?ջ?ʱ?")
    @TableField("receive_time")
    private Date receiveTime;

    @Schema(description = "?ջ???ע")
    @TableField("receive_note")
    private String receiveNote;

    @Schema(description = "?ջ??绰")
    @TableField("receive_phone")
    private String receivePhone;

    @Schema(description = "??˾?ջ???ַ")
    @TableField("company_address")
    private String companyAddress;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
