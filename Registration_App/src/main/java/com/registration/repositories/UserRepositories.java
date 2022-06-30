package com.registration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.entitites.User;

public interface UserRepositories extends JpaRepository<User, Long> {

}
