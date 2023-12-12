package com.example.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootapp.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	// will provide CRUD for User entity
}
