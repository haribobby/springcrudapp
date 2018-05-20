package com.emp.springcrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.springcrudapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
