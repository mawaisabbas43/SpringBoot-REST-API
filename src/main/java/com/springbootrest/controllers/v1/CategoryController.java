package com.springbootrest.controllers.v1;

import com.springbootrest.api.v1.model.CategoryDTO;
import com.springbootrest.api.v1.model.CategoryListDTO;
import com.springbootrest.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping(CategoryController.BASE_URL)
@RestController
public class CategoryController {

    public static final String BASE_URL = "/api/v1/categories";

    private final CategoryService categoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CategoryListDTO getAllCategories(){

        return new CategoryListDTO(categoryService.getAllCategories());
    }

    @GetMapping("{name}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO getCategoryByName( @PathVariable String name){
        return categoryService.getCategoryByName(name);
    }
}
