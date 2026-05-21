package com.joker.gulimall.product.controller;

import com.joker.gulimall.common.domain.R;
import com.joker.gulimall.product.service.CategoryService;
import com.joker.gulimall.product.vo.CategoryTreeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * ??Ʒ??????? 前端控制器
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
@RestController
@RequestMapping("/product/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list/tree")
    public R<List<CategoryTreeVo>> listTree() {
        List<CategoryTreeVo> treeList =categoryService.getTreeList();
        return R.ok(treeList);
    }
}
