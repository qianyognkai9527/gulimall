package com.joker.gulimall.product.entity;

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
 * ??Ʒ?
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Getter
@Setter
@TableName("pms_attr")
@Schema(name = "Attr", description = "$!{table.comment}")
public class Attr extends Model<Attr> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "????id")
    @TableId(value = "attr_id", type = IdType.AUTO)
    private Long attrId;

    @Schema(description = "?????")
    @TableField("attr_name")
    private String attrName;

    @Schema(description = "?Ƿ???Ҫ????[0-????Ҫ??1-??Ҫ]")
    @TableField("search_type")
    private Byte searchType;

    @Schema(description = "????ͼ?")
    @TableField("icon")
    private String icon;

    @Schema(description = "??ѡֵ?б?[?ö??ŷָ")
    @TableField("value_select")
    private String valueSelect;

    @Schema(description = "????????[0-???????ԣ?1-???????ԣ?2-???????????????ǻ???????]")
    @TableField("attr_type")
    private Byte attrType;

    @Schema(description = "????״̬[0 - ???ã?1 - ????]")
    @TableField("enable")
    private Long enable;

    @Schema(description = "???????")
    @TableField("catelog_id")
    private Long catelogId;

    @Schema(description = "????չʾ???Ƿ?չʾ?ڽ????ϣ?0-?? 1-?ǡ?????sku????Ȼ???Ե")
    @TableField("show_desc")
    private Byte showDesc;

    @Override
    public Serializable pkVal() {
        return this.attrId;
    }
}
