package com.gustavo.atividade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.atividade.entities.User;


public interface UserRepository extends JpaRepository<User, Long>  {

}
