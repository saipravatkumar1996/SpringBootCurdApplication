package com.hexaphor.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Status")
public class Status {
	@Id
	private Integer Status_Id;
	private String status;
	public Integer getStatus_Id() {
		return Status_Id;
	}
	public void setStatus_Id(Integer status_Id) {
		Status_Id = status_Id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
