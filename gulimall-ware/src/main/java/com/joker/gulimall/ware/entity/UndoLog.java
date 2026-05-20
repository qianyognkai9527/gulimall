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
 * 
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("undo_log")
@Schema(name = "UndoLog", description = "$!{table.comment}")
public class UndoLog extends Model<UndoLog> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("branch_id")
    private Long branchId;

    @TableField("xid")
    private String xid;

    @TableField("context")
    private String context;

    @TableField("rollback_info")
    private byte[] rollbackInfo;

    @TableField("log_status")
    private Integer logStatus;

    @TableField("log_created")
    private Date logCreated;

    @TableField("log_modified")
    private Date logModified;

    @TableField("ext")
    private String ext;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
