package com.luizrosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizrosa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
