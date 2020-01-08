package com.hexaphor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hexaphor.entity.Login_User;

@Repository
public interface Login_User_Repository extends JpaRepository<Login_User, String> {

	@Query("select count(*) from Login_User lu where lu.User_Name=:username && lu.password=:password ")
	public Integer user_login(@Param("username")String userName ,@Param("password")String password);
}
