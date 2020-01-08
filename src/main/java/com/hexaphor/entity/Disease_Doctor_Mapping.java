package com.hexaphor.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Disease_Doctor_Mapping")
public class Disease_Doctor_Mapping {
	@Id
	private String Disease_Doctor_Mapping_Id;
	private String Doctor_Id;
	private String Disease_Id;
	private Date Updated_By;
	private Date Created_By;
	private Integer status;
	
	public String getDisease_Doctor_Mapping_Id() {
		return Disease_Doctor_Mapping_Id;
	}
	public void setDisease_Doctor_Mapping_Id(String disease_Doctor_Mapping_Id) {
		Disease_Doctor_Mapping_Id = disease_Doctor_Mapping_Id;
	}
	public String getDoctor_Id() {
		return Doctor_Id;
	}
	public void setDoctor_Id(String doctor_Id) {
		Doctor_Id = doctor_Id;
	}
	public String getDisease_Id() {
		return Disease_Id;
	}
	public void setDisease_Id(String disease_Id) {
		Disease_Id = disease_Id;
	}
	public Date getUpdated_By() {
		return Updated_By;
	}
	public void setUpdated_By(Date updated_By) {
		Updated_By = updated_By;
	}
	public Date getCreated_By() {
		return Created_By;
	}
	public void setCreated_By(Date created_By) {
		Created_By = created_By;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

}
