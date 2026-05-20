package com.joker.gulimall.member.entity;

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
 * ??Ա?ղص?ר???
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("ums_member_collect_subject")
@Schema(name = "MemberCollectSubject", description = "$!{table.comment}")
public class MemberCollectSubject extends Model<MemberCollectSubject> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "subject_id")
    @TableField("subject_id")
    private Long subjectId;

    @Schema(description = "subject_name")
    @TableField("subject_name")
    private String subjectName;

    @Schema(description = "subject_img")
    @TableField("subject_img")
    private String subjectImg;

    @Schema(description = "?url")
    @TableField("subject_urll")
    private String subjectUrll;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
