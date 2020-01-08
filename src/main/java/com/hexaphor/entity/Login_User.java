package com.hexaphor.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Login_User")
public class Login_User {
	@Id
	private String Login_Id;
	private String User_Name;
	private String password;
	private String Role;
	
	public String getLogin_Id() {
		return Login_Id;
	}
	public void setLogin_Id(String login_Id) {
		Login_Id = login_Id;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	

}
