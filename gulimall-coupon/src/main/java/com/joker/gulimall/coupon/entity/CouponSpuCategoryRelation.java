package com.joker.gulimall.coupon.entity;

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
 * ?Ż?ȯ????????
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("sms_coupon_spu_category_relation")
@Schema(name = "CouponSpuCategoryRelation", description = "$!{table.comment}")
public class CouponSpuCategoryRelation extends Model<CouponSpuCategoryRelation> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "?Ż?ȯid")
    @TableField("coupon_id")
    private Long couponId;

    @Schema(description = "??Ʒ????id")
    @TableField("category_id")
    private Long categoryId;

    @Schema(description = "??Ʒ?????")
    @TableField("category_name")
    private String categoryName;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
