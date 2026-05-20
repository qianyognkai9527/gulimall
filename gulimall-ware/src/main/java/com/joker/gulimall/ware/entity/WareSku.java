package com.joker.gulimall.ware.entity;

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
 * 商品库存
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("wms_ware_sku")
@Schema(name = "WareSku", description = "$!{table.comment}")
public class WareSku extends Model<WareSku> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "sku_id")
    @TableField("sku_id")
    private Long skuId;

    @Schema(description = "仓库id")
    @TableField("ware_id")
    private Long wareId;

    @Schema(description = "库存数")
    @TableField("stock")
    private Integer stock;

    @Schema(description = "sku_name")
    @TableField("sku_name")
    private String skuName;

    @Schema(description = "锁定库存")
    @TableField("stock_locked")
    private Integer stockLocked;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
