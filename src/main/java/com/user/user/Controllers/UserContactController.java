package com.user.user.Controllers;

import com.user.user.Repository.UserContactRepository;

import java.util.List;

import com.user.user.Models.User;
import com.user.user.Models.UserContact;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



@Controller
@RequestMapping("/usercontact")
public class UserContactController {
    
    @Autowired
	private UserContactRepository usercontact_repository;

    @GetMapping("/userscontacts")
	public ResponseEntity<List<UserContact>> getAllUsersContacts(){
		return ResponseEntity.ok(usercontact_repository.findAll());
	}
	
	@ResponseBody
	@GetMapping(path = "/usercontact/{user_id}")
	public ResponseEntity<List<UserContact>> getUserContact(@PathVariable String user_id) {
		return ResponseEntity.ok(usercontact_repository.findByUserid(user_id));
	}

	/*@ResponseBody
	@RequestMapping(path = "/user/{user_id}/{user_name}/{profile_pic}/{last_seen}/{created}", method = RequestMethod.POST)
	public String createUser(@RequestParam("user_id") String user_id, @RequestParam("user_name") String user_name, @RequestParam("profile_pic") String profile_pic,@RequestParam("last_seen") String last_seen,@RequestParam("created") String created) {
		User savedUser = user_repository.save(new User(user_id,user_name,profile_pic,last_seen,created));
		//LOG.info(savedUser.toString() + " successfully saved into DB.");
		return savedUser.getUser_id() + " :ok:" ;
	}*/

	@PostMapping(path="/add")
	public ResponseEntity<User> create(@RequestBody UserContact userContact){
		usercontact_repository.save(userContact);
		return ResponseEntity.ok().build();
	}

}
