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
 * ??ҳר??????jd??ҳ?????ܶ?ר?⣬ÿ??ר???????µ?ҳ?棬չʾר????Ʒ??Ϣ??
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("sms_home_subject")
@Schema(name = "HomeSubject", description = "$!{table.comment}")
public class HomeSubject extends Model<HomeSubject> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "ר???")
    @TableField("name")
    private String name;

    @Schema(description = "ר?????")
    @TableField("title")
    private String title;

    @Schema(description = "ר?⸱???")
    @TableField("sub_title")
    private String subTitle;

    @Schema(description = "??ʾ״̬")
    @TableField("status")
    private Boolean status;

    @Schema(description = "???????")
    @TableField("url")
    private String url;

    @Schema(description = "???")
    @TableField("sort")
    private Integer sort;

    @Schema(description = "ר??ͼƬ??ַ")
    @TableField("img")
    private String img;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
