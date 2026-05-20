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
 * ??Ա?ջ???ַ
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("ums_member_receive_address")
@Schema(name = "MemberReceiveAddress", description = "$!{table.comment}")
public class MemberReceiveAddress extends Model<MemberReceiveAddress> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "member_id")
    @TableField("member_id")
    private Long memberId;

    @Schema(description = "?ջ??????")
    @TableField("name")
    private String name;

    @Schema(description = "?绰")
    @TableField("phone")
    private String phone;

    @Schema(description = "???????")
    @TableField("post_code")
    private String postCode;

    @Schema(description = "ʡ??/ֱϽ?")
    @TableField("province")
    private String province;

    @Schema(description = "???")
    @TableField("city")
    private String city;

    @Schema(description = "?")
    @TableField("region")
    private String region;

    @Schema(description = "??ϸ??ַ(?ֵ?)")
    @TableField("detail_address")
    private String detailAddress;

    @Schema(description = "ʡ?????")
    @TableField("areacode")
    private String areacode;

    @Schema(description = "?Ƿ?Ĭ?")
    @TableField("default_status")
    private Boolean defaultStatus;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
