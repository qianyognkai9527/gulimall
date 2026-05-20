package com.joker.gulimall.order.entity;

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
 * ??????????Ϣ
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("oms_order_setting")
@Schema(name = "OrderSetting", description = "$!{table.comment}")
public class OrderSetting extends Model<OrderSetting> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "??ɱ??????ʱ?ر?ʱ??(??)")
    @TableField("flash_order_overtime")
    private Integer flashOrderOvertime;

    @Schema(description = "??????????ʱʱ??(??)")
    @TableField("normal_order_overtime")
    private Integer normalOrderOvertime;

    @Schema(description = "???????Զ?ȷ???ջ?ʱ?䣨?죩")
    @TableField("confirm_overtime")
    private Integer confirmOvertime;

    @Schema(description = "?Զ????ɽ???ʱ?䣬?????????˻????죩")
    @TableField("finish_overtime")
    private Integer finishOvertime;

    @Schema(description = "???????ɺ??Զ?????ʱ?䣨?죩")
    @TableField("comment_overtime")
    private Integer commentOvertime;

    @Schema(description = "??Ա?ȼ???0-???޻?Ա?ȼ???ȫ??ͨ?ã?????-??Ӧ????????Ա?ȼ???")
    @TableField("member_level")
    private Byte memberLevel;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
