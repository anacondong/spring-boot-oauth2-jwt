package com.sample.springoauth2jwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.springoauth2jwt.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    User findByUserName(String username);
}
