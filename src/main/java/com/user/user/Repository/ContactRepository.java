package com.user.user.Repository;

import com.user.user.Models.Contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface ContactRepository extends JpaRepository<Contact,String>{

    Contact findByContactid(@Param("contactid") String contactid);
    
}
