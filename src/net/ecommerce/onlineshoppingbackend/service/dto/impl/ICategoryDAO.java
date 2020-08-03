package net.ecommerce.onlineshoppingbackend.service.dto.impl;

import net.ecommerce.onlineshoppingbackend.dtos.CategoryDTO;

import java.util.List;

interface ICategoryDTO {

    List<CategoryDTO> categoryList();

    /**
     * @param categoryId
     * @return
     */
    CategoryDTO getCategoryProductById(int categoryId);

}