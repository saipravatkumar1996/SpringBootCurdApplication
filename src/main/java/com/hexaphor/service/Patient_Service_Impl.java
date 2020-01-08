package com.hexaphor.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hexaphor.Global.StaticData;
import com.hexaphor.entity.Login_User;
import com.hexaphor.entity.Patient_Reg;
import com.hexaphor.entity.Tracker_Id;
import com.hexaphor.pojo.Login_User_Pojo;
import com.hexaphor.pojo.Patient_Reg_Pojo;
import com.hexaphor.repository.Login_User_Repository;
import com.hexaphor.repository.Patient_Reg_Repository;
import com.hexaphor.repository.Status_Repository;
import com.hexaphor.repository.Tracker_Id_Repository;

@Service
@Transactional
public class Patient_Service_Impl implements Patient_Service {
	Logger logger = (Logger) LoggerFactory.getLogger(Patient_Service_Impl.class);
	@Autowired
	private Patient_Reg_Repository patient_Reg_Repository;
	@Autowired
	private Login_User_Repository login_User_Repository;
	@Autowired
	private Status_Repository status_Repository;
	@Autowired
	private Tracker_Id_Repository tracker_Id_Repository;
	
	@Override
	public Patient_Reg_Pojo Patient_Registration(Patient_Reg_Pojo patient_Reg_Pojo) throws Exception {
		logger.info(this.getClass()+" :Patient_Registration start");
		Patient_Reg patient_Reg=null;
		Tracker_Id tracker_Id=null;
		Login_User login_User=null;
	
		Long tracker_number=0l;
		String Tracking_ID=null;
		
		//create patient_Reg object and Login_User Object
		patient_Reg=new Patient_Reg();
		login_User=new Login_User();
		//copy object data
		BeanUtils.copyProperties(patient_Reg_Pojo, patient_Reg);
		BeanUtils.copyProperties(patient_Reg_Pojo, login_User);
		
		//Insert Login User Data Logic
		tracker_Id=tracker_Id_Repository.getOne(2);
		tracker_number=Long.parseLong(tracker_Id.getLast_id_insert().substring(2, 10))+1;
		Tracking_ID=tracker_Id.getLast_id_insert().substring(0, 1)+tracker_number.toString();
		login_User.setLogin_Id(Tracking_ID);
		login_User.setRole("RL2");
		login_User=login_User_Repository.save(login_User);
		tracker_Id_Repository.UpdatedTrackerID(Tracking_ID);
		logger.info(this.getClass()+" :Login User Inserted sucessful");
		
		//fetch Patient_reg last tracker for Id  by Patient_Reg table
		tracker_Id=tracker_Id_Repository.getOne(1);
		tracker_number=Long.parseLong(tracker_Id.getLast_id_insert().substring(2, 10))+1;
		Tracking_ID=tracker_Id.getLast_id_insert().substring(0, 1)+tracker_number.toString();
		patient_Reg.setPatient_Id(Tracking_ID);
		patient_Reg.setLogin_Id(login_User.getLogin_Id());
		Integer status_Id=status_Repository.getStatucByStatus_Name(patient_Reg_Pojo.getStatus());
		patient_Reg.setStatus(status_Id);
		patient_Reg=patient_Reg_Repository.save(patient_Reg);
		logger.info(this.getClass()+" :patient_Registration Inserted sucessful");
		
		return null;
	}

	@Override
	public List<Patient_Reg_Pojo> get_All_Patient_Registration() throws Exception {
		logger.info(this.getClass()+" :get_All_Patient_Registration start");
		List<Patient_Reg> listPatient_Reg=null;
		List<Patient_Reg_Pojo> listPatient_Reg_Pojo=null;
		listPatient_Reg_Pojo=new ArrayList<Patient_Reg_Pojo>();
		listPatient_Reg=patient_Reg_Repository.findAll();
		for (Patient_Reg patient_Reg : listPatient_Reg) {
			Patient_Reg_Pojo patient_Reg_Pojo=new Patient_Reg_Pojo();
			BeanUtils.copyProperties(patient_Reg, patient_Reg_Pojo);
			//BeanUtils.copyProperties(patient_Reg, StaticData.getAllPatient);
			StaticData.getAllPatient.add(patient_Reg_Pojo);
			listPatient_Reg_Pojo.add(patient_Reg_Pojo);
		}
		List<Login_User> loginUser=login_User_Repository.findAll();
		for (Login_User login_User : loginUser) {
			Login_User_Pojo login_pojo=new Login_User_Pojo();
			BeanUtils.copyProperties(login_User, login_pojo);
			StaticData.GetAllLoginUser.add(login_pojo);
		}
		logger.info(this.getClass()+" :get_All_Patient_Registration end");
		return listPatient_Reg_Pojo;
	}

	@Override
	public Patient_Reg_Pojo get_Patient_By_Id(String patientID) throws Exception {
		Patient_Reg patient_Reg=null;
		Patient_Reg_Pojo patient_Reg_Pojo=null;
		patient_Reg_Pojo=new Patient_Reg_Pojo();
		patient_Reg=patient_Reg_Repository.getOne(patientID);
		BeanUtils.copyProperties(patient_Reg, patient_Reg_Pojo);
		BeanUtils.copyProperties(patient_Reg, StaticData.patientByID);
		return patient_Reg_Pojo;
	}

}
