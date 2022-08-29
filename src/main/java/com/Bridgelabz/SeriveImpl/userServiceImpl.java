package com.Bridgelabz.SeriveImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.Bridgelabz.Repository.userRepository;
import com.Bridgelabz.Service.userService;
import com.Bridgelabz.model.UserModel;


public class userServiceImpl implements userService {
@Autowired 
userRepository repo;


public UserModel addUser(UserModel userModel) {
	return repo.save(userModel);
}


public List<UserModel> getAllUser() {
	return repo.findAll();
}


public UserModel userUpdate( Long id, UserModel userModel) {
	Optional<UserModel> isId=repo.findById(userModel.getId());
	if(isId.isPresent()) {
		UserModel um=isId.get();
		um.setFirstname(userModel.getFirstname());
		um.setLastname(userModel.getLastname());
		um.setCreateddate(userModel.getCreateddate());
		um.setUpdatedate(userModel.getUpdatedate());
		um.setPassword(userModel.getPassword());
		
return repo.save(um);
	}
	else {
		return repo.save(userModel);
	}
}


public void  userdelete(Long id) {
	Optional<UserModel> isId=repo.findById(id);
	if(isId.isPresent()) {
		repo.deleteById(id);
	}
	else {
		System.out.println("Data not Found"); 
	}
}


}
