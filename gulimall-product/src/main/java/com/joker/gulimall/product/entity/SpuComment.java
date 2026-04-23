package com.joker.gulimall.product.entity;

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
 * ??Ʒ???
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Getter
@Setter
@TableName("pms_spu_comment")
@Schema(name = "SpuComment", description = "$!{table.comment}")
public class SpuComment extends Model<SpuComment> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "sku_id")
    @TableField("sku_id")
    private Long skuId;

    @Schema(description = "spu_id")
    @TableField("spu_id")
    private Long spuId;

    @Schema(description = "??Ʒ?")
    @TableField("spu_name")
    private String spuName;

    @Schema(description = "??Ա?ǳ")
    @TableField("member_nick_name")
    private String memberNickName;

    @Schema(description = "?Ǽ?")
    @TableField("star")
    private Boolean star;

    @Schema(description = "??Աip")
    @TableField("member_ip")
    private String memberIp;

    @Schema(description = "????ʱ?")
    @TableField("create_time")
    private Date createTime;

    @Schema(description = "??ʾ״̬[0-????ʾ??1-??ʾ]")
    @TableField("show_status")
    private Boolean showStatus;

    @Schema(description = "????ʱ???????")
    @TableField("spu_attributes")
    private String spuAttributes;

    @Schema(description = "?????")
    @TableField("likes_count")
    private Integer likesCount;

    @Schema(description = "?ظ??")
    @TableField("reply_count")
    private Integer replyCount;

    @Schema(description = "????ͼƬ/??Ƶ[json???ݣ?[{type:?ļ?????,url:??Դ·??}]]")
    @TableField("resources")
    private String resources;

    @Schema(description = "???")
    @TableField("content")
    private String content;

    @Schema(description = "?û?ͷ?")
    @TableField("member_icon")
    private String memberIcon;

    @Schema(description = "????????[0 - ????Ʒ??ֱ?????ۣ?1 - ?????۵Ļظ?]")
    @TableField("comment_type")
    private Byte commentType;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
