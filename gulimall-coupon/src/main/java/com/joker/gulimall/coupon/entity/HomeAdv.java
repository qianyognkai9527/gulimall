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
 * ??ҳ?ֲ????
 * </p>
 *
 * @author joker
 * @since 2026-05-15
 */
@Getter
@Setter
@TableName("sms_home_adv")
@Schema(name = "HomeAdv", description = "$!{table.comment}")
public class HomeAdv extends Model<HomeAdv> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "?")
    @TableField("name")
    private String name;

    @Schema(description = "ͼƬ??ַ")
    @TableField("pic")
    private String pic;

    @Schema(description = "??ʼʱ?")
    @TableField("start_time")
    private Date startTime;

    @Schema(description = "????ʱ?")
    @TableField("end_time")
    private Date endTime;

    @Schema(description = "״̬")
    @TableField("status")
    private Boolean status;

    @Schema(description = "???")
    @TableField("click_count")
    private Integer clickCount;

    @Schema(description = "???????????ӵ?ַ")
    @TableField("url")
    private String url;

    @Schema(description = "??ע")
    @TableField("note")
    private String note;

    @Schema(description = "???")
    @TableField("sort")
    private Integer sort;

    @Schema(description = "?????")
    @TableField("publisher_id")
    private Long publisherId;

    @Schema(description = "?????")
    @TableField("auth_id")
    private Long authId;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
