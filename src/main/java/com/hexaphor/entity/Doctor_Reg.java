package com.hexaphor.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Doctor_Reg")
public class Doctor_Reg {
	@Id
	private String Doctor_Id;
	private String Doctor_Name;
	private Long Mobile_Number;
	private String Login_Id;
	private Date Created_By;
	private Date Updated_By;
	private Integer status;
	private String Role;
	
	public String getDoctor_Id() {
		return Doctor_Id;
	}
	public void setDoctor_Id(String doctor_Id) {
		Doctor_Id = doctor_Id;
	}
	public String getDoctor_Name() {
		return Doctor_Name;
	}
	public void setDoctor_Name(String doctor_Name) {
		Doctor_Name = doctor_Name;
	}
	public Long getMobile_Number() {
		return Mobile_Number;
	}
	public void setMobile_Number(Long mobile_Number) {
		Mobile_Number = mobile_Number;
	}
	public String getLogin_Id() {
		return Login_Id;
	}
	public void setLogin_Id(String login_Id) {
		Login_Id = login_Id;
	}
	public Date getCreated_By() {
		return Created_By;
	}
	public void setCreated_By(Date created_By) {
		Created_By = created_By;
	}
	public Date getUpdated_By() {
		return Updated_By;
	}
	public void setUpdated_By(Date updated_By) {
		Updated_By = updated_By;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	

}
