package com.user.user.Models;
//import java.util.HashSet;
//import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="usercontact")
public class UserContact {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "userid")
    private int userid;
    @Column(name = "contactid")
    private int contactid;
 
    //@ManyToMany(mappedBy = "contactid")
    //private Set<UserContact> contacts = new HashSet<>();

    //@ManyToMany(mappedBy = "userid")
    //private Set<UserContact> users = new HashSet<>();

    public int getid() {
        return this.id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getContactid() {
        return this.contactid;
    }

    public void setContactid(int id_contact) {
        this.contactid = id_contact;
    }

    public int getUserid() {
        return this.userid;
    }

    public void setUserid(int id_user) {
        this.userid = id_user;
    }

    public UserContact(int id_contact, int id_user){
        this.contactid = id_contact;
        this.userid = id_user;
    }

    public UserContact(){

    }

}