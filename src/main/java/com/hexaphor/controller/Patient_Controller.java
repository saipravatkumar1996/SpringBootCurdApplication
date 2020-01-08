package com.hexaphor.controller;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaphor.pojo.Patient_Reg_Pojo;
import com.hexaphor.service.Patient_Service;

@RestController("e-patient")
public class Patient_Controller {
	@Autowired
	private Patient_Service Patient_Service;
	Logger logger = (Logger) LoggerFactory.getLogger(Patient_Controller.class);
	@GetMapping("patient_registration")
public ResponseEntity<String>  patient_registration(@RequestBody Patient_Reg_Pojo patient_Reg_Pojo){
	
	logger.info(this.getClass()+" :patient_registration start");
	try{
	Patient_Service.Patient_Registration(patient_Reg_Pojo);
	logger.info(this.getClass()+" :patient_registration Sucessfuled Registration");
	return new ResponseEntity<>("Sucessed",HttpStatus.OK);
	}
	catch(Exception e){
		logger.info(this.getClass()+" :patient_registration unsucessfuled Registration");
		return new ResponseEntity<>("UnSucessed",HttpStatus.EXPECTATION_FAILED);
	}
}
	
	
}
