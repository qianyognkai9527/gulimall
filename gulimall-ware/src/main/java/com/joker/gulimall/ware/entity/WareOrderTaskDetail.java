package com.joker.gulimall.ware.entity;

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
 * 库存工作单
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("wms_ware_order_task_detail")
@Schema(description = "库存工作单")
public class WareOrderTaskDetail extends Model<WareOrderTaskDetail> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "sku_id")
    @TableField("sku_id")
    private Long skuId;

    @Schema(description = "sku_name")
    @TableField("sku_name")
    private String skuName;

    @Schema(description = "购买个数")
    @TableField("sku_num")
    private Integer skuNum;

    @Schema(description = "工作单id")
    @TableField("task_id")
    private Long taskId;

    @Schema(description = "仓库id")
    @TableField("ware_id")
    private Long wareId;

    @Schema(description = "1-已锁定  2-已解锁  3-扣减")
    @TableField("lock_status")
    private Integer lockStatus;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
