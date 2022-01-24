package com.user.user.Models;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
        
    //Primary key
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userid;
    @Column(name = "username")
    private String username;
    @Column(name = "profilepic")
    private String profilepic;
    @Column(name = "lastseen")
    private int lastseen;
    @Column(name = "created")
    private int created;
 
    //@ManyToMany(cascade = { CascadeType.ALL })
    //@JoinTable(name = "usercontact",joinColumns = { @JoinColumn(name = "user_id") },
    //inverseJoinColumns = { @JoinColumn(name = "userid")})

    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String user_id) {
        this.userid = user_id;
    }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String user_name) {
        this.username = user_name;
    }

    public String getProfilepic() {
        return this.profilepic;
    }

    public void setProfilepic(String profile_pic) {
        this.profilepic = profile_pic;
    }

    public int getLastseen() {
        return this.lastseen;
    }

    public void setLastseen(int last_seen) {
        this.lastseen = last_seen;
    }

    public int getCreated() {
        return this.created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public User(){
        
    }

    public User(String user_id, String user_name, String profile_pic, int last_seen, int created){
        this.userid = user_id;
        this.username = user_name;
        this.profilepic = profile_pic;
        this.lastseen = last_seen;
        this.created = created;
    }

    @Override
    public String toString(){
        return "User: |id: " + userid + "| name: " + username + "| last seen: " + lastseen + "| created: " + created;
    }

}
