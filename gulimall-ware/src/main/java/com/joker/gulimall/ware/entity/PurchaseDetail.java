package com.joker.gulimall.ware.entity;

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
 * 
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("wms_purchase_detail")
@Schema(name = "PurchaseDetail", description = "$!{table.comment}")
public class PurchaseDetail extends Model<PurchaseDetail> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "采购单id")
    @TableField("purchase_id")
    private Long purchaseId;

    @Schema(description = "采购商品id")
    @TableField("sku_id")
    private Long skuId;

    @Schema(description = "采购数量")
    @TableField("sku_num")
    private Integer skuNum;

    @Schema(description = "采购金额")
    @TableField("sku_price")
    private BigDecimal skuPrice;

    @Schema(description = "仓库id")
    @TableField("ware_id")
    private Long wareId;

    @Schema(description = "状态[0新建，1已分配，2正在采购，3已完成，4采购失败]")
    @TableField("status")
    private Integer status;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
