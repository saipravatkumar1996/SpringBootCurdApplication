package com.hexaphor.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role_Mapping {

	@Id
	private String role_Mapping_id;
	private String role;
	private String dscription;
	public String getRole_Mapping_id() {
		return role_Mapping_id;
	}
	public void setRole_Mapping_id(String role_Mapping_id) {
		this.role_Mapping_id = role_Mapping_id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDscription() {
		return dscription;
	}
	public void setDscription(String dscription) {
		this.dscription = dscription;
	}
}
