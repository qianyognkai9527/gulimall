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
 * ??Ʒ???ۻظ???ϵ
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Getter
@Setter
@TableName("pms_comment_replay")
@Schema(name = "CommentReplay", description = "$!{table.comment}")
public class CommentReplay extends Model<CommentReplay> {

    private static final long serialVersionUID = 1L;

    @Schema(description = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "????id")
    @TableField("comment_id")
    private Long commentId;

    @Schema(description = "?ظ?id")
    @TableField("reply_id")
    private Long replyId;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
