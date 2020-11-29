package com.gustavo.atividade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.atividade.entities.Category;
import com.gustavo.atividade.entities.User;


public interface CategoryRepository extends JpaRepository<Category, Long>  {

}
