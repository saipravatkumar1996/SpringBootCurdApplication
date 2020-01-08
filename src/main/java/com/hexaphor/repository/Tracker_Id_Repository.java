package com.hexaphor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hexaphor.entity.Tracker_Id;
@Repository
public interface Tracker_Id_Repository extends JpaRepository<Tracker_Id, Integer> {

	@Query("update table Tracker_Id set last_id_insert=:last_id_insert where Tracker_Id=1")
	public Integer UpdatedTrackerID(@Param("last_id_insert")String last_id_insert);
}
