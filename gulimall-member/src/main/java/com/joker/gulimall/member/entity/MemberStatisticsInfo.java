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
 * ??Աͳ????Ϣ
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("ums_member_statistics_info")
@Schema(name = "MemberStatisticsInfo", description = "$!{table.comment}")
public class MemberStatisticsInfo extends Model<MemberStatisticsInfo> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "??Աid")
    @TableField("member_id")
    private Long memberId;

    @Schema(description = "?ۼ????ѽ")
    @TableField("consume_amount")
    private BigDecimal consumeAmount;

    @Schema(description = "?ۼ??Żݽ")
    @TableField("coupon_amount")
    private BigDecimal couponAmount;

    @Schema(description = "?????")
    @TableField("order_count")
    private Integer orderCount;

    @Schema(description = "?Ż?ȯ?")
    @TableField("coupon_count")
    private Integer couponCount;

    @Schema(description = "?????")
    @TableField("comment_count")
    private Integer commentCount;

    @Schema(description = "?˻??")
    @TableField("return_order_count")
    private Integer returnOrderCount;

    @Schema(description = "??¼???")
    @TableField("login_count")
    private Integer loginCount;

    @Schema(description = "??ע?")
    @TableField("attend_count")
    private Integer attendCount;

    @Schema(description = "??˿?")
    @TableField("fans_count")
    private Integer fansCount;

    @Schema(description = "?ղص???Ʒ?")
    @TableField("collect_product_count")
    private Integer collectProductCount;

    @Schema(description = "?ղص?ר????")
    @TableField("collect_subject_count")
    private Integer collectSubjectCount;

    @Schema(description = "?ղص??????")
    @TableField("collect_comment_count")
    private Integer collectCommentCount;

    @Schema(description = "???????????")
    @TableField("invite_friend_count")
    private Integer inviteFriendCount;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
