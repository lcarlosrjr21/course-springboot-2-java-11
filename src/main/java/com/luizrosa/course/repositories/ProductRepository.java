package com.luizrosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizrosa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
