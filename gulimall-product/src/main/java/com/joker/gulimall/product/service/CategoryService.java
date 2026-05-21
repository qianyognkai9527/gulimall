package com.joker.gulimall.product.service;

import com.joker.gulimall.product.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.joker.gulimall.product.vo.CategoryTreeVo;

import java.util.List;

/**
 * <p>
 * ??Ʒ??????? 服务类
 * </p>
 *
 * @author joker
 * @since 2026-04-23
 */
public interface CategoryService extends IService<Category> {

    List<CategoryTreeVo> getTreeList();

}
