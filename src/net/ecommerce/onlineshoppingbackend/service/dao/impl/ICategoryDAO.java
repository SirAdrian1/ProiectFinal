package net.ecommerce.onlineshoppingbackend.service.dao.impl;

import net.ecommerce.onlineshoppingbackend.dtos.CategoryDTO;

import java.util.List;

public interface ICategoryDAO {
    List<CategoryDTO> categoryList();

    CategoryDTO getCategoryProductById(int categoryId);
}
