package com.hexaphor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaphor.entity.Patient_Reg;

@Repository
public interface Patient_Reg_Repository extends JpaRepository<Patient_Reg, String> {

}
