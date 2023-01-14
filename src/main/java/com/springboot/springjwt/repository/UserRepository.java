package com.springboot.springjwt.repository;

import com.springboot.springjwt.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,String> {
    @Query("SELECT U FROM UserEntity U WHERE U.username = :username")
    UserEntity findUserByUsername(String username);
}
