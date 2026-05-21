package com.joker.gulimall.product.vo;


import com.google.common.collect.Lists;
import com.joker.gulimall.common.utils.tree.TreeNode;
import com.joker.gulimall.product.entity.Category;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "商品三级分类")
public class CategoryTreeVo extends Category implements TreeNode<CategoryTreeVo> {

    private List<CategoryTreeVo> children= Lists.newArrayList();

    @Override
    public Long getId() {
        return this.getCatId();
    }

    @Override
    public Long getParentId() {
        return this.getParentCid();
    }

    @Override
    public void setChildren(List<CategoryTreeVo> children) {
        this.children = children;
    }
}
