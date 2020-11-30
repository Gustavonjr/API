package com.gustavo.atividade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.atividade.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

}
