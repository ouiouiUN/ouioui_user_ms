package com.user.user.Repository;

import com.user.user.Models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String>{

    
}
