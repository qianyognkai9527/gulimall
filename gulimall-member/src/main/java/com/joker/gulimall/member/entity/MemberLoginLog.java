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
 * ??Ա??¼??¼
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("ums_member_login_log")
@Schema(name = "MemberLoginLog", description = "$!{table.comment}")
public class MemberLoginLog extends Model<MemberLoginLog> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "member_id")
    @TableField("member_id")
    private Long memberId;

    @Schema(description = "????ʱ?")
    @TableField("create_time")
    private Date createTime;

    @Schema(description = "ip")
    @TableField("ip")
    private String ip;

    @Schema(description = "city")
    @TableField("city")
    private String city;

    @Schema(description = "??¼????[1-web??2-app]")
    @TableField("login_type")
    private Boolean loginType;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
