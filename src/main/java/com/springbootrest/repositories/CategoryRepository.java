package com.springbootrest.repositories;

import com.springbootrest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
