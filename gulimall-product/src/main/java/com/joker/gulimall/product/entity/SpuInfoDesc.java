package com.joker.gulimall.product.entity;

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
 * spu??Ϣ???
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Getter
@Setter
@TableName("pms_spu_info_desc")
@Schema(name = "SpuInfoDesc", description = "$!{table.comment}")
public class SpuInfoDesc extends Model<SpuInfoDesc> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "??Ʒid")
    @TableId("spu_id")
    private Long spuId;

    @Schema(description = "??Ʒ???")
    @TableField("decript")
    private String decript;

    @Override
    public Serializable pkVal() {
        return this.spuId;
    }
}
