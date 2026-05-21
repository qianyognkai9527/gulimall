package com.joker.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.joker.gulimall.common.utils.bean.BeanUtils;
import com.joker.gulimall.common.utils.tree.TreeBuilder;
import com.joker.gulimall.product.entity.Category;
import com.joker.gulimall.product.mapper.CategoryMapper;
import com.joker.gulimall.product.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.joker.gulimall.product.vo.CategoryTreeVo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * ??Ʒ??????? 服务实现类
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Override
    public List<CategoryTreeVo> getTreeList() {
        LambdaQueryWrapper<Category> categoryLambdaQueryWrapper = Wrappers.<Category>lambdaQuery().orderByAsc(Category::getSort);

        List<Category> list = this.list(categoryLambdaQueryWrapper);
        List<CategoryTreeVo> collect = list.stream().map(item -> {
            CategoryTreeVo categoryTreeVo = new CategoryTreeVo();
            BeanUtils.copyBeanProp(categoryTreeVo, item);
            return categoryTreeVo;
        }).collect(Collectors.toList());
        List<CategoryTreeVo> treeList = TreeBuilder.buildTree(collect, 0L);
        return treeList;
    }
}
