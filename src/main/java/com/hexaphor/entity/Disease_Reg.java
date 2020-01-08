package com.hexaphor.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Disease_Reg")
public class Disease_Reg {
	
	@Id
	private String Disease_Id;
	private String Disease_Name;
	private Date Updated_By;
	private Date Created_By;
	private Integer status;
	public Date getCreated_By() {
		return Created_By;
	}
	public void setCreated_By(Date created_By) {
		Created_By = created_By;
	}
	public String getDisease_Id() {
		return Disease_Id;
	}
	public void setDisease_Id(String disease_Id) {
		Disease_Id = disease_Id;
	}
	public String getDisease_Name() {
		return Disease_Name;
	}
	public void setDisease_Name(String disease_Name) {
		Disease_Name = disease_Name;
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
	

}
