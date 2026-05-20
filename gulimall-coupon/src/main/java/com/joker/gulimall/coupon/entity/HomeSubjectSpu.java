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
 * ר????Ʒ
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("sms_home_subject_spu")
@Schema(name = "HomeSubjectSpu", description = "$!{table.comment}")
public class HomeSubjectSpu extends Model<HomeSubjectSpu> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "ר???")
    @TableField("name")
    private String name;

    @Schema(description = "ר??id")
    @TableField("subject_id")
    private Long subjectId;

    @Schema(description = "spu_id")
    @TableField("spu_id")
    private Long spuId;

    @Schema(description = "???")
    @TableField("sort")
    private Integer sort;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
