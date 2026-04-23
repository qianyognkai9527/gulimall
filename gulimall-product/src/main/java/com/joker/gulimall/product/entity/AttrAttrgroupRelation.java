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
 * ????&???Է???????
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Getter
@Setter
@TableName("pms_attr_attrgroup_relation")
@Schema(name = "AttrAttrgroupRelation", description = "$!{table.comment}")
public class AttrAttrgroupRelation extends Model<AttrAttrgroupRelation> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "????id")
    @TableField("attr_id")
    private Long attrId;

    @Schema(description = "???Է???id")
    @TableField("attr_group_id")
    private Long attrGroupId;

    @Schema(description = "???????????")
    @TableField("attr_sort")
    private Integer attrSort;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
