package com.luizrosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizrosa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
