package com.luizrosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizrosa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
