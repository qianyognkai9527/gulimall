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
 * spuͼƬ
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Getter
@Setter
@TableName("pms_spu_images")
@Schema(name = "SpuImages", description = "$!{table.comment}")
public class SpuImages extends Model<SpuImages> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "spu_id")
    @TableField("spu_id")
    private Long spuId;

    @Schema(description = "ͼƬ?")
    @TableField("img_name")
    private String imgName;

    @Schema(description = "ͼƬ??ַ")
    @TableField("img_url")
    private String imgUrl;

    @Schema(description = "˳?")
    @TableField("img_sort")
    private Integer imgSort;

    @Schema(description = "?Ƿ?Ĭ??ͼ")
    @TableField("default_img")
    private Byte defaultImg;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
