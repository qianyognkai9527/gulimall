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
 * ??Ʒ???????
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Getter
@Setter
@TableName("pms_category")
@Schema(name = "Category", description = "$!{table.comment}")
public class Category extends Model<Category> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "????id")
    @TableId(value = "cat_id", type = IdType.AUTO)
    private Long catId;

    @Schema(description = "?????")
    @TableField("name")
    private String name;

    @Schema(description = "??????id")
    @TableField("parent_cid")
    private Long parentCid;

    @Schema(description = "?㼶")
    @TableField("cat_level")
    private Integer catLevel;

    @Schema(description = "?Ƿ???ʾ[0-????ʾ??1??ʾ]")
    @TableField("show_status")
    private Byte showStatus;

    @Schema(description = "???")
    @TableField("sort")
    private Integer sort;

    @Schema(description = "ͼ????ַ")
    @TableField("icon")
    private String icon;

    @Schema(description = "??????λ")
    @TableField("product_unit")
    private String productUnit;

    @Schema(description = "??Ʒ?")
    @TableField("product_count")
    private Integer productCount;

    @Override
    public Serializable pkVal() {
        return this.catId;
    }
}
