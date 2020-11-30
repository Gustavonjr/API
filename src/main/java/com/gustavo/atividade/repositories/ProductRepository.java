package com.gustavo.atividade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.atividade.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>  {

}
