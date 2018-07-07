package com.github.trungee.springbootmicroserviceforexservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.trungee.springbootmicroserviceforexservice.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
