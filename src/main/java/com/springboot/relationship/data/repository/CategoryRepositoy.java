package com.springboot.relationship.data.repository;

import com.springboot.relationship.data.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositoy extends JpaRepository<Category, Long> {
}
