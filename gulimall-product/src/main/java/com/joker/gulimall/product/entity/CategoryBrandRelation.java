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
 * Ʒ?Ʒ???????
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Getter
@Setter
@TableName("pms_category_brand_relation")
@Schema(name = "CategoryBrandRelation", description = "$!{table.comment}")
public class CategoryBrandRelation extends Model<CategoryBrandRelation> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "Ʒ??id")
    @TableField("brand_id")
    private Long brandId;

    @Schema(description = "????id")
    @TableField("catelog_id")
    private Long catelogId;

    @TableField("brand_name")
    private String brandName;

    @TableField("catelog_name")
    private String catelogName;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
