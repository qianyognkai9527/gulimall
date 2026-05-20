package com.joker.gulimall.ware.entity;

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
 * 库存工作单
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("wms_ware_order_task")
@Schema(name = "WareOrderTask", description = "$!{table.comment}")
public class WareOrderTask extends Model<WareOrderTask> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "order_id")
    @TableField("order_id")
    private Long orderId;

    @Schema(description = "order_sn")
    @TableField("order_sn")
    private String orderSn;

    @Schema(description = "收货人")
    @TableField("consignee")
    private String consignee;

    @Schema(description = "收货人电话")
    @TableField("consignee_tel")
    private String consigneeTel;

    @Schema(description = "配送地址")
    @TableField("delivery_address")
    private String deliveryAddress;

    @Schema(description = "订单备注")
    @TableField("order_comment")
    private String orderComment;

    @Schema(description = "付款方式【 1:在线付款 2:货到付款】")
    @TableField("payment_way")
    private Boolean paymentWay;

    @Schema(description = "任务状态")
    @TableField("task_status")
    private Byte taskStatus;

    @Schema(description = "订单描述")
    @TableField("order_body")
    private String orderBody;

    @Schema(description = "物流单号")
    @TableField("tracking_no")
    private String trackingNo;

    @Schema(description = "create_time")
    @TableField("create_time")
    private Date createTime;

    @Schema(description = "仓库id")
    @TableField("ware_id")
    private Long wareId;

    @Schema(description = "工作单备注")
    @TableField("task_comment")
    private String taskComment;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
