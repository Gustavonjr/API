package com.gustavo.atividade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.atividade.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>  {

}
