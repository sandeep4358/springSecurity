package com.example.SpringSecurityCheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringSecurityCheck.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
