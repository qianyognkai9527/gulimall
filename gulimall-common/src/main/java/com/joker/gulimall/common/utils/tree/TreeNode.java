package com.joker.gulimall.common.utils.tree;

import java.util.List;
 
public interface TreeNode<T> {
    Long getId();
    Long getParentId();
    void setChildren(List<T> children);
}