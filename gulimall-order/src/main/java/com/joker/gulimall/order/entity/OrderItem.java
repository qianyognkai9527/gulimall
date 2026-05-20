package com.joker.gulimall.order.entity;

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
 * ????????Ϣ
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("oms_order_item")
@Schema(name = "OrderItem", description = "$!{table.comment}")
public class OrderItem extends Model<OrderItem> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "order_id")
    @TableField("order_id")
    private Long orderId;

    @Schema(description = "order_sn")
    @TableField("order_sn")
    private String orderSn;

    @Schema(description = "spu_id")
    @TableField("spu_id")
    private Long spuId;

    @Schema(description = "spu_name")
    @TableField("spu_name")
    private String spuName;

    @Schema(description = "spu_pic")
    @TableField("spu_pic")
    private String spuPic;

    @Schema(description = "Ʒ?")
    @TableField("spu_brand")
    private String spuBrand;

    @Schema(description = "??Ʒ????id")
    @TableField("category_id")
    private Long categoryId;

    @Schema(description = "??Ʒsku???")
    @TableField("sku_id")
    private Long skuId;

    @Schema(description = "??Ʒsku?")
    @TableField("sku_name")
    private String skuName;

    @Schema(description = "??ƷskuͼƬ")
    @TableField("sku_pic")
    private String skuPic;

    @Schema(description = "??Ʒsku?۸")
    @TableField("sku_price")
    private BigDecimal skuPrice;

    @Schema(description = "??Ʒ???????")
    @TableField("sku_quantity")
    private Integer skuQuantity;

    @Schema(description = "??Ʒ???????????ϣ?JSON??")
    @TableField("sku_attrs_vals")
    private String skuAttrsVals;

    @Schema(description = "??Ʒ?????ֽ??")
    @TableField("promotion_amount")
    private BigDecimal promotionAmount;

    @Schema(description = "?Ż?ȯ?Żݷֽ??")
    @TableField("coupon_amount")
    private BigDecimal couponAmount;

    @Schema(description = "?????Żݷֽ??")
    @TableField("integration_amount")
    private BigDecimal integrationAmount;

    @Schema(description = "????Ʒ?????Żݺ??ķֽ??")
    @TableField("real_amount")
    private BigDecimal realAmount;

    @Schema(description = "???ͻ")
    @TableField("gift_integration")
    private Integer giftIntegration;

    @Schema(description = "???ͳɳ?ֵ")
    @TableField("gift_growth")
    private Integer giftGrowth;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
