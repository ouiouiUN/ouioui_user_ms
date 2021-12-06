package com.user.user.Controllers;

import java.util.List;

import com.user.user.Models.Contact;
import com.user.user.Repository.ContactRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/contact")
public class ContactController {
    
    @Autowired
    private ContactRepository contact_repository;

    @GetMapping("/contacts")
    public ResponseEntity<List<Contact>> getAllContacts(){
        return ResponseEntity.ok(contact_repository.findAll());
    }

    @ResponseBody
	@GetMapping(path = "/contact/{contact_id}")
	public ResponseEntity<Contact> getContact(@PathVariable String contact_id) {
		return ResponseEntity.ok(contact_repository.findById(contact_id).get());
	}

	/*@ResponseBody
	@RequestMapping(path = "/user/{user_id}/{user_name}/{profile_pic}/{last_seen}/{created}", method = RequestMethod.POST)
	public String createUser(@RequestParam("user_id") String user_id, @RequestParam("user_name") String user_name, @RequestParam("profile_pic") String profile_pic,@RequestParam("last_seen") String last_seen,@RequestParam("created") String created) {
		User savedUser = user_repository.save(new User(user_id,user_name,profile_pic,last_seen,created));
		//LOG.info(savedUser.toString() + " successfully saved into DB.");
		return savedUser.getUser_id() + " :ok:" ;
	}*/

	@PostMapping(path="/add")
	public ResponseEntity<Contact> create(@RequestBody Contact contact){
		contact_repository.save(contact);
		return ResponseEntity.ok().build();
	}

}
