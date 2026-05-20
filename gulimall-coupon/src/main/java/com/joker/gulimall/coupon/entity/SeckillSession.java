package com.joker.gulimall.coupon.entity;

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
 * ??ɱ????
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("sms_seckill_session")
@Schema(name = "SeckillSession", description = "$!{table.comment}")
public class SeckillSession extends Model<SeckillSession> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "?????")
    @TableField("name")
    private String name;

    @Schema(description = "ÿ?տ?ʼʱ?")
    @TableField("start_time")
    private Date startTime;

    @Schema(description = "ÿ?ս???ʱ?")
    @TableField("end_time")
    private Date endTime;

    @Schema(description = "????״̬")
    @TableField("status")
    private Boolean status;

    @Schema(description = "????ʱ?")
    @TableField("create_time")
    private Date createTime;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
