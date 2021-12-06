package com.user.user.Models;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="usercontact")
public class UserContact {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "userid")
    private String userid;
    @Column(name = "contactid")
    private String contactid;
 
    @ManyToMany(mappedBy = "contactid")
    private Set<UserContact> contacts = new HashSet<>();

    @ManyToMany(mappedBy = "userid")
    private Set<UserContact> users = new HashSet<>();

    public int getid() {
        return this.id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getContactid() {
        return this.contactid;
    }

    public void setContactid(String id_contact) {
        this.contactid = id_contact;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String id_user) {
        this.userid = id_user;
    }

    public UserContact(String id_contact, String id_user){
        this.contactid = id_contact;
        this.userid = id_user;
    }

    public UserContact(){

    }

}