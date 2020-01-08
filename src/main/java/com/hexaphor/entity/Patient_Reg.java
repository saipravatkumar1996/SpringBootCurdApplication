package com.hexaphor.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Patient_Reg")

public class Patient_Reg {
	@Id
	private String patient_Id;
	private String patient_Name;
	private Long Mobile_Number;
	private String Address;
	private String Gender;
	private String Login_Id;
	private  String Created_By;
	private String Updated_By;
	private String Role;
	private Integer status;
	public String getPatient_Id() {
		return patient_Id;
	}
	public void setPatient_Id(String patient_Id) {
		this.patient_Id = patient_Id;
	}
	public String getPatient_Name() {
		return patient_Name;
	}
	public void setPatient_Name(String patient_Name) {
		this.patient_Name = patient_Name;
	}
	public Long getMobile_Number() {
		return Mobile_Number;
	}
	public void setMobile_Number(Long mobile_Number) {
		Mobile_Number = mobile_Number;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getLogin_Id() {
		return Login_Id;
	}
	public void setLogin_Id(String login_Id) {
		Login_Id = login_Id;
	}
	public String getCreated_By() {
		return Created_By;
	}
	public void setCreated_By(String created_By) {
		Created_By = created_By;
	}
	public String getUpdated_By() {
		return Updated_By;
	}
	public void setUpdated_By(String updated_By) {
		Updated_By = updated_By;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	

}
