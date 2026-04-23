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
 * Ʒ?
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Getter
@Setter
@TableName("pms_brand")
@Schema(name = "Brand", description = "$!{table.comment}")
public class Brand extends Model<Brand> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "Ʒ??id")
    @TableId(value = "brand_id", type = IdType.AUTO)
    private Long brandId;

    @Schema(description = "Ʒ???")
    @TableField("name")
    private String name;

    @Schema(description = "Ʒ??logo??ַ")
    @TableField("logo")
    private String logo;

    @Schema(description = "???")
    @TableField("descript")
    private String descript;

    @Schema(description = "??ʾ״̬[0-????ʾ??1-??ʾ]")
    @TableField("show_status")
    private Byte showStatus;

    @Schema(description = "????????ĸ")
    @TableField("first_letter")
    private String firstLetter;

    @Schema(description = "???")
    @TableField("sort")
    private Integer sort;

    @Override
    public Serializable pkVal() {
        return this.brandId;
    }
}
