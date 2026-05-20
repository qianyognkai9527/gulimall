package com.joker.gulimall.order.entity;

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
 * ?˿???Ϣ
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("oms_refund_info")
@Schema(name = "RefundInfo", description = "$!{table.comment}")
public class RefundInfo extends Model<RefundInfo> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "?˿??Ķ???")
    @TableField("order_return_id")
    private Long orderReturnId;

    @Schema(description = "?˿??")
    @TableField("refund")
    private BigDecimal refund;

    @Schema(description = "?˿????ˮ?")
    @TableField("refund_sn")
    private String refundSn;

    @Schema(description = "?˿?״̬")
    @TableField("refund_status")
    private Boolean refundStatus;

    @Schema(description = "?˿?????[1-֧??????2-΢?ţ?3-??????4-???")
    @TableField("refund_channel")
    private Byte refundChannel;

    @TableField("refund_content")
    private String refundContent;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
