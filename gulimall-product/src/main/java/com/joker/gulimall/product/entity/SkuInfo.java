package com.joker.gulimall.product.entity;

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
 * sku??Ϣ
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Getter
@Setter
@TableName("pms_sku_info")
@Schema(name = "SkuInfo", description = "$!{table.comment}")
public class SkuInfo extends Model<SkuInfo> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "skuId")
    @TableId(value = "sku_id", type = IdType.AUTO)
    private Long skuId;

    @Schema(description = "spuId")
    @TableField("spu_id")
    private Long spuId;

    @Schema(description = "sku?")
    @TableField("sku_name")
    private String skuName;

    @Schema(description = "sku???????")
    @TableField("sku_desc")
    private String skuDesc;

    @Schema(description = "????????id")
    @TableField("catalog_id")
    private Long catalogId;

    @Schema(description = "Ʒ??id")
    @TableField("brand_id")
    private Long brandId;

    @Schema(description = "Ĭ??ͼƬ")
    @TableField("sku_default_img")
    private String skuDefaultImg;

    @Schema(description = "???")
    @TableField("sku_title")
    private String skuTitle;

    @Schema(description = "?????")
    @TableField("sku_subtitle")
    private String skuSubtitle;

    @Schema(description = "?۸")
    @TableField("price")
    private BigDecimal price;

    @Schema(description = "?")
    @TableField("sale_count")
    private Long saleCount;

    @Override
    public Serializable pkVal() {
        return this.skuId;
    }
}
