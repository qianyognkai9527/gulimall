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
 * 仓库信息
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("wms_ware_info")
@Schema(name = "WareInfo", description = "$!{table.comment}")
public class WareInfo extends Model<WareInfo> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "仓库名")
    @TableField("name")
    private String name;

    @Schema(description = "仓库地址")
    @TableField("address")
    private String address;

    @Schema(description = "区域编码")
    @TableField("areacode")
    private String areacode;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
