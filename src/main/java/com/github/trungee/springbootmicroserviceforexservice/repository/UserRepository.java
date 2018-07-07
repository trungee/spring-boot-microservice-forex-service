package com.github.trungee.springbootmicroserviceforexservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.trungee.springbootmicroserviceforexservice.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
