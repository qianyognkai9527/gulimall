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
 * ??Ա
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("ums_member")
@Schema(name = "Member", description = "$!{table.comment}")
public class Member extends Model<Member> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "??Ա?ȼ?id")
    @TableField("level_id")
    private Long levelId;

    @Schema(description = "?û??")
    @TableField("username")
    private String username;

    @Schema(description = "???")
    @TableField("password")
    private String password;

    @Schema(description = "?ǳ")
    @TableField("nickname")
    private String nickname;

    @Schema(description = "?ֻ????")
    @TableField("mobile")
    private String mobile;

    @Schema(description = "???")
    @TableField("email")
    private String email;

    @Schema(description = "ͷ?")
    @TableField("header")
    private String header;

    @Schema(description = "?Ա")
    @TableField("gender")
    private Byte gender;

    @Schema(description = "?")
    @TableField("birth")
    private Date birth;

    @Schema(description = "???ڳ??")
    @TableField("city")
    private String city;

    @Schema(description = "ְҵ")
    @TableField("job")
    private String job;

    @Schema(description = "????ǩ?")
    @TableField("sign")
    private String sign;

    @Schema(description = "?û???Դ")
    @TableField("source_type")
    private Byte sourceType;

    @Schema(description = "?")
    @TableField("integration")
    private Integer integration;

    @Schema(description = "?ɳ?ֵ")
    @TableField("growth")
    private Integer growth;

    @Schema(description = "????״̬")
    @TableField("status")
    private Byte status;

    @Schema(description = "ע??ʱ?")
    @TableField("create_time")
    private Date createTime;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
