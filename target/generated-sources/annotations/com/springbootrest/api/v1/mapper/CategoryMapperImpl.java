package com.springbootrest.api.v1.mapper;

import com.springbootrest.api.v1.model.CategoryDTO;
import com.springbootrest.domain.Category;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-09T02:48:19+0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO categoryToCategoryDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setId( category.getId() );
        categoryDTO.setName( category.getName() );

        return categoryDTO;
    }
}
