package com.joker.gulimall.member.entity;

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
 * ??Ա?ղص???Ʒ
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("ums_member_collect_spu")
@Schema(name = "MemberCollectSpu", description = "$!{table.comment}")
public class MemberCollectSpu extends Model<MemberCollectSpu> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId("id")
    private Long id;

    @Schema(description = "??Աid")
    @TableField("member_id")
    private Long memberId;

    @Schema(description = "spu_id")
    @TableField("spu_id")
    private Long spuId;

    @Schema(description = "spu_name")
    @TableField("spu_name")
    private String spuName;

    @Schema(description = "spu_img")
    @TableField("spu_img")
    private String spuImg;

    @Schema(description = "create_time")
    @TableField("create_time")
    private Date createTime;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
