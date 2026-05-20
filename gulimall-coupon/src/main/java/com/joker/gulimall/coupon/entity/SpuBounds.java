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
 * ??Ʒspu???????
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("sms_spu_bounds")
@Schema(name = "SpuBounds", description = "$!{table.comment}")
public class SpuBounds extends Model<SpuBounds> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("spu_id")
    private Long spuId;

    @Schema(description = "?ɳ??")
    @TableField("grow_bounds")
    private BigDecimal growBounds;

    @Schema(description = "?????")
    @TableField("buy_bounds")
    private BigDecimal buyBounds;

    @Schema(description = "?Ż???Ч????[1111???ĸ?״̬λ?????ҵ?????;0 - ???Żݣ??ɳ??????Ƿ?????;1 - ???Żݣ??????????Ƿ?????;2 - ???Żݣ??ɳ??????Ƿ?????;3 - ???Żݣ??????????Ƿ????͡?״̬λ0???????ͣ?1?????͡?]")
    @TableField("work")
    private Boolean work;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
