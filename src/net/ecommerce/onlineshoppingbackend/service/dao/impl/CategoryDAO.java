package net.ecommerce.onlineshoppingbackend.service.dao.impl;

import net.ecommerce.onlineshoppingbackend.dtos.CategoryDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Valentin Radoi
 *
 */
public class CategoryDAO implements ICategoryDAO{

    private static List<CategoryDTO> categoryList = new ArrayList<>();

    static {
        CategoryDTO category = new CategoryDTO();
        category.setId(1);
        category.setName("TV");
        category.setImageURL("Cat_1.png");
        category.setDescription("This is some Desc for TV");
        category.setActive(true);
        categoryList.add(category);

        category = new CategoryDTO();
        category.setId(2);
        category.setName("Mobile");
        category.setImageURL("Cat_1.png");
        category.setDescription("This is some Desc for Mobile");
        category.setActive(true);
        categoryList.add(category);

        category = new CategoryDTO();
        category.setId(3);
        category.setName("Laptop");
        category.setImageURL("Cat_1.png");
        category.setDescription("This is some Desc for Laptop");
        category.setActive(true);
        categoryList.add(category);
    }

    @Override
    public List<CategoryDTO> categoryList() {
        return categoryList;
    }

    @Override
    public CategoryDTO getCategoryProductById(int categoryId) {
        for(CategoryDTO category: categoryList) {
            if(category.getId() == categoryId) {
                return category;
            }
        }
        return null;
    }

}

