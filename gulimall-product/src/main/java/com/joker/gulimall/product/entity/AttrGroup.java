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
 * ???Է??
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Getter
@Setter
@TableName("pms_attr_group")
@Schema(name = "AttrGroup", description = "$!{table.comment}")
public class AttrGroup extends Model<AttrGroup> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "????id")
    @TableId(value = "attr_group_id", type = IdType.AUTO)
    private Long attrGroupId;

    @Schema(description = "???")
    @TableField("attr_group_name")
    private String attrGroupName;

    @Schema(description = "???")
    @TableField("sort")
    private Integer sort;

    @Schema(description = "???")
    @TableField("descript")
    private String descript;

    @Schema(description = "??ͼ?")
    @TableField("icon")
    private String icon;

    @Schema(description = "????????id")
    @TableField("catelog_id")
    private Long catelogId;

    @Override
    public Serializable pkVal() {
        return this.attrGroupId;
    }
}
