package com.joker.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * spu??Ϣ
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Getter
@Setter
@TableName("pms_spu_info")
@Schema(name = "SpuInfo", description = "$!{table.comment}")
public class SpuInfo extends Model<SpuInfo> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "??Ʒid")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "??Ʒ?")
    @TableField("spu_name")
    private String spuName;

    @Schema(description = "??Ʒ???")
    @TableField("spu_description")
    private String spuDescription;

    @Schema(description = "????????id")
    @TableField("catalog_id")
    private Long catalogId;

    @Schema(description = "Ʒ??id")
    @TableField("brand_id")
    private Long brandId;

    @TableField("weight")
    private BigDecimal weight;

    @Schema(description = "?ϼ?״̬[0 - ?¼ܣ?1 - ?ϼ?]")
    @TableField("publish_status")
    private Byte publishStatus;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
