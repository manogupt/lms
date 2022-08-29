
package com.Bridgelabz.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bridgelabz.SeriveImpl.userServiceImpl;
import com.Bridgelabz.model.UserModel;

@RestController
@RequestMapping("/user")
public class userController {

@Autowired
userServiceImpl UserServiceImpl;

@PostMapping("/adduser")

	public UserModel addUser(@RequestBody UserModel  userModel){
	return UserServiceImpl.addUser(userModel);
}
@GetMapping("/getAll")
 public List<UserModel> getAllUser(){
	 return UserServiceImpl.getAllUser();
	
 }
@PutMapping("/putAll")
 public UserModel userUpdate(@PathVariable Long id, @RequestBody UserModel userModel) {
	 return UserServiceImpl.userUpdate(id,userModel);
 }
 
 public void userdelete(@PathVariable Long id) {
 UserServiceImpl.userdelete(id);

}
}