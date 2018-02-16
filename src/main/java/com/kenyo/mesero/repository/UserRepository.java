package com.kenyo.mesero.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenyo.mesero.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findOneByUsername(String username);
}
