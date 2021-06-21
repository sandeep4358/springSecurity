package com.example.SpringSecurityCheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringSecurityCheck.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
