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
 * ?˻?ԭ?
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("oms_order_return_reason")
@Schema(name = "OrderReturnReason", description = "$!{table.comment}")
public class OrderReturnReason extends Model<OrderReturnReason> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "?˻?ԭ?")
    @TableField("name")
    private String name;

    @Schema(description = "???")
    @TableField("sort")
    private Integer sort;

    @Schema(description = "????״̬")
    @TableField("status")
    private Boolean status;

    @Schema(description = "create_time")
    @TableField("create_time")
    private Date createTime;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
