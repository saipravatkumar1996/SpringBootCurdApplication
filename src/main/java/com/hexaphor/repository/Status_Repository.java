package com.hexaphor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hexaphor.entity.Status;
@Repository
public interface Status_Repository extends JpaRepository<Status, Integer> {

	@Query("select Status_Id from Status where status=:status")
	public Integer getStatucByStatus_Name(@Param("status")String status);
}
