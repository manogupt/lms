package com.Bridgelabz.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.Bridgelabz.model.UserModel;

public interface userService {

	List<UserModel> getAllUser();
}