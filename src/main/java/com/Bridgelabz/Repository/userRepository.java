package com.Bridgelabz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bridgelabz.model.UserModel;

public interface userRepository extends JpaRepository<UserModel, Long>{

}
