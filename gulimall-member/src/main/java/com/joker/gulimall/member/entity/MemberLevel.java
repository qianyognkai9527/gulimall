package com.joker.gulimall.member.entity;

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
 * ??Ա?ȼ?
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("ums_member_level")
@Schema(name = "MemberLevel", description = "$!{table.comment}")
public class MemberLevel extends Model<MemberLevel> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "?ȼ??")
    @TableField("name")
    private String name;

    @Schema(description = "?ȼ???Ҫ?ĳɳ?ֵ")
    @TableField("growth_point")
    private Integer growthPoint;

    @Schema(description = "?Ƿ?ΪĬ?ϵȼ?[0->???ǣ?1->??]")
    @TableField("default_status")
    private Byte defaultStatus;

    @Schema(description = "???˷ѱ?׼")
    @TableField("free_freight_point")
    private BigDecimal freeFreightPoint;

    @Schema(description = "ÿ?????ۻ?ȡ?ĳɳ?ֵ")
    @TableField("comment_growth_point")
    private Integer commentGrowthPoint;

    @Schema(description = "?Ƿ?????????Ȩ")
    @TableField("priviledge_free_freight")
    private Byte priviledgeFreeFreight;

    @Schema(description = "?Ƿ??л?Ա?۸???Ȩ")
    @TableField("priviledge_member_price")
    private Byte priviledgeMemberPrice;

    @Schema(description = "?Ƿ?????????Ȩ")
    @TableField("priviledge_birthday")
    private Byte priviledgeBirthday;

    @Schema(description = "??ע")
    @TableField("note")
    private String note;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
