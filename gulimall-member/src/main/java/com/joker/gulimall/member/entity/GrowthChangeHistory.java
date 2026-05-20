package com.joker.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * ?ɳ?ֵ?仯??ʷ??¼
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("ums_growth_change_history")
@Schema(name = "GrowthChangeHistory", description = "$!{table.comment}")
public class GrowthChangeHistory extends Model<GrowthChangeHistory> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "member_id")
    @TableField("member_id")
    private Long memberId;

    @Schema(description = "create_time")
    @TableField("create_time")
    private Date createTime;

    @Schema(description = "?ı???ֵ?????????")
    @TableField("change_count")
    private Integer changeCount;

    @Schema(description = "??ע")
    @TableField("note")
    private String note;

    @Schema(description = "??????Դ[0-???1-????Ա?޸?]")
    @TableField("source_type")
    private Byte sourceType;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
