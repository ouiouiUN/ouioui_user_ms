package com.user.user.Models;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
        
    //Primary key
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String user_id;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "profile_pic")
    private String profile_pic;
    @Column(name = "last_seen")
    private String last_seen;
    @Column(name = "created")
    private String created;
 
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "usercontact",joinColumns = { @JoinColumn(name = "user_id") },
    inverseJoinColumns = { @JoinColumn(name = "userid")})

    public String getUser_id() {
        return this.user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }


    public String getUser_name() {
        return this.user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getProfile_pic() {
        return this.profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getLast_seen() {
        return this.last_seen;
    }

    public void setLast_seen(String last_seen) {
        this.last_seen = last_seen;
    }

    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public User(){
        
    }

    public User(String user_id, String user_name, String profile_pic, String last_seen, String created){
        this.user_id = user_id;
        this.user_name = user_name;
        this.profile_pic = profile_pic;
        this.last_seen = last_seen;
        this.created = created;
    }

    @Override
    public String toString(){
        return "User: |id: " + user_id + "| name: " + user_name + "| last seen: " + last_seen + "| created: " + created;
    }

}
