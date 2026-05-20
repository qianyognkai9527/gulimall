package com.joker.gulimall.order.entity;

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
 * ??????????ʷ??¼
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("oms_order_operate_history")
@Schema(name = "OrderOperateHistory", description = "$!{table.comment}")
public class OrderOperateHistory extends Model<OrderOperateHistory> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "????id")
    @TableField("order_id")
    private Long orderId;

    @Schema(description = "??????[?û???ϵͳ????̨????Ա]")
    @TableField("operate_man")
    private String operateMan;

    @Schema(description = "????ʱ?")
    @TableField("create_time")
    private Date createTime;

    @Schema(description = "????״̬??0->?????1->????????2->?ѷ?????3->?????ɣ?4->?ѹرգ?5->??Ч??????")
    @TableField("order_status")
    private Byte orderStatus;

    @Schema(description = "??ע")
    @TableField("note")
    private String note;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
