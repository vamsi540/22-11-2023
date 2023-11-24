package com.vamsi.restfullwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vamsi.restfullwebservices.entity.User;
public interface UserRepository extends JpaRepository<User, Long> {
	
}
