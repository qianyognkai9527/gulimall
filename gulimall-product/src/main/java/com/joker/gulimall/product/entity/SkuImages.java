package com.joker.gulimall.product.entity;

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
 * skuͼƬ
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Getter
@Setter
@TableName("pms_sku_images")
@Schema(name = "SkuImages", description = "$!{table.comment}")
public class SkuImages extends Model<SkuImages> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "sku_id")
    @TableField("sku_id")
    private Long skuId;

    @Schema(description = "ͼƬ??ַ")
    @TableField("img_url")
    private String imgUrl;

    @Schema(description = "???")
    @TableField("img_sort")
    private Integer imgSort;

    @Schema(description = "Ĭ??ͼ[0 - ????Ĭ??ͼ??1 - ??Ĭ??ͼ]")
    @TableField("default_img")
    private Integer defaultImg;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
