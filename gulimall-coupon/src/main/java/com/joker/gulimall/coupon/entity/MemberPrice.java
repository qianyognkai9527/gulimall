package com.joker.gulimall.coupon.entity;

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
 * ??Ʒ??Ա?۸
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("sms_member_price")
@Schema(name = "MemberPrice", description = "$!{table.comment}")
public class MemberPrice extends Model<MemberPrice> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "sku_id")
    @TableField("sku_id")
    private Long skuId;

    @Schema(description = "??Ա?ȼ?id")
    @TableField("member_level_id")
    private Long memberLevelId;

    @Schema(description = "??Ա?ȼ??")
    @TableField("member_level_name")
    private String memberLevelName;

    @Schema(description = "??Ա??Ӧ?۸")
    @TableField("member_price")
    private BigDecimal memberPrice;

    @Schema(description = "?ɷ??????????Ż?[0-???ɵ????Żݣ?1-?ɵ???]")
    @TableField("add_other")
    private Boolean addOther;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
