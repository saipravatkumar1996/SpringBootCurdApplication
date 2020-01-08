package com.hexaphor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Tracker_Id")
public class Tracker_Id {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Tracker_Id;
	private String Table_Name;
	private String Prefix;
	private Integer file_size;
	private String last_id_insert;
	public Integer getTracker_Id() {
		return Tracker_Id;
	}
	public void setTracker_Id(Integer tracker_Id) {
		Tracker_Id = tracker_Id;
	}
	public String getTable_Name() {
		return Table_Name;
	}
	public void setTable_Name(String table_Name) {
		Table_Name = table_Name;
	}
	public String getPrefix() {
		return Prefix;
	}
	public void setPrefix(String prefix) {
		Prefix = prefix;
	}
	public Integer getFile_size() {
		return file_size;
	}
	public void setFile_size(Integer file_size) {
		this.file_size = file_size;
	}
	public String getLast_id_insert() {
		return last_id_insert;
	}
	public void setLast_id_insert(String last_id_insert) {
		this.last_id_insert = last_id_insert;
	}
	
}
