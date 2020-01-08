package com.hexaphor.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Role")
public class Role {
	@Id
	private String Role_Id;
	private String Role;
	private String Description;
	public String getRole_Id() {
		return Role_Id;
	}
	public void setRole_Id(String role_Id) {
		Role_Id = role_Id;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	

}
