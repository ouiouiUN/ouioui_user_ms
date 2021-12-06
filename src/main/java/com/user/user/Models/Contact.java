package com.user.user.Models;

import javax.persistence.*;

@Entity
@Table(name="contact")
public class Contact {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "contactid")
    private String contactid;
    @Column(name = "contactname")
    private String contactname;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "usercontact",joinColumns = { @JoinColumn(name = "contactid") },
    inverseJoinColumns = { @JoinColumn(name = "contactid")})

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContactid() {
        return this.contactid;
    }

    public void setContactid(String id_contact) {
        this.contactid = id_contact;
    }

    public String getsetContactname() {
        return this.contactname;
    }

    public void setsetContactname(String id_user) {
        this.contactname = id_user;
    }

    public Contact(String id_contact, String contact_name){
        this.contactid = id_contact;
        this.contactname = contact_name;
    }

    public Contact(){

    }

}
