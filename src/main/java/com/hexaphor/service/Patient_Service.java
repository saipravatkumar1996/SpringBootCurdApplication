package com.hexaphor.service;

import java.util.List;

import com.hexaphor.pojo.Patient_Reg_Pojo;

public interface Patient_Service {
	
	public Patient_Reg_Pojo Patient_Registration(Patient_Reg_Pojo patient_Reg_Pojo)throws Exception;
	public List<Patient_Reg_Pojo> get_All_Patient_Registration()throws Exception;
	public Patient_Reg_Pojo get_Patient_By_Id(String patientID)throws Exception;

}
