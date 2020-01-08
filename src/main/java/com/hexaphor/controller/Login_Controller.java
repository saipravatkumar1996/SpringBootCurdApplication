package com.hexaphor.controller;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hexaphor.Global.StaticData;
import com.hexaphor.service.Login_Service;
import com.hexaphor.service.Patient_Service;

@RestController
public class Login_Controller {
	
	@Autowired
	private Login_Service login_Service;
	@Autowired
	private Patient_Service patient_Service;
	Logger logger = (Logger) LoggerFactory.getLogger(Login_Controller.class);
	StaticData loginuser;
	@GetMapping("login_user")
	public ResponseEntity<String> login(@RequestParam String userName,@RequestParam String password){
		
		try{
			login_Service.login(userName, password);
			if(StaticData.GetLoginUserByUserName.getRole().equals("Admin")){
				patient_Service.get_All_Patient_Registration();
			}
			else if(StaticData.GetLoginUserByUserName.getRole().equals("Patient")){
				patient_Service.get_Patient_By_Id(userName);
			}
			else if(StaticData.GetLoginUserByUserName.getRole().equals("Clinic")){
				
			}
		}
		catch(Exception e){
			
		}
		
		return null;
	}
	
	@GetMapping("forgetpassword")
	public String forgetPassword(@RequestParam String userName,@RequestParam String gmail){
		 String result=null;
		  try{
			  result=  login_Service.forgetPassword(userName, gmail);
			  if(result.equals("your password send to mail")){
				  return "Your Password Send to your registared email ID ";
			  }
			  else if(result.equals("Enter Correct Email ID and User Name")){
				  return "Enter Correct Email ID and User Name";
			  }
			  else{
				  return "Enter Correct  User Name"; 
			  }
		  }
		  catch(Exception e){
			  return "Enter Correct  User Name";
		  }
		
	}

}
