package com.user.user.Repository;

import java.util.List;

import com.user.user.Models.UserContact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserContactRepository extends JpaRepository<UserContact,String> {

    List<UserContact> findByUserid(@Param("userid") String userid);

}
