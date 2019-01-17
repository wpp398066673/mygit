package com.example.hibernatetest.dao;

import com.example.hibernatetest.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserEntity,Long> {

    UserEntity save(UserEntity entity);
    UserEntity findByName(String name);
}
