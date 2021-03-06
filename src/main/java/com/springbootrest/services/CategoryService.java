package com.springbootrest.services;

import com.springbootrest.api.v1.model.CategoryDTO;
import com.springbootrest.api.v1.model.CustomerDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
