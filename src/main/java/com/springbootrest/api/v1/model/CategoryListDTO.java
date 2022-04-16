package com.springbootrest.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class CategoryListDTO {

    List<CategoryDTO> categories;

}
