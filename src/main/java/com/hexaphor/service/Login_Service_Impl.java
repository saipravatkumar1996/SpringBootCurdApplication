package com.hexaphor.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hexaphor.Global.StaticData;
import com.hexaphor.entity.Login_User;
import com.hexaphor.pojo.Patient_Reg_Pojo;
import com.hexaphor.repository.Login_User_Repository;

@Service
@Transactional
public class Login_Service_Impl implements Login_Service {

	@Autowired
	private Login_User_Repository login_User_Repository;
	@Override
	public void login(String userName, String password) throws Exception {
		
		
	
		Integer result=login_User_Repository.user_login(userName, password);
		if(result==0){
			//return login_User_Pojo;
		}
		else{
		Login_User login_user=	login_User_Repository.getOne(userName);
		BeanUtils.copyProperties(login_user, com.hexaphor.Global.StaticData.GetLoginUserByUserName);
		//return com.hexaphor.Global.StaticData.GetLoginUserByUserName;
		}
		
	}
	@Override
	public String forgetPassword(String userName, String gmail) throws Exception {
		
		Login_User login_User =null;
		
		login_User=login_User_Repository.getOne(userName);
		if(login_User!=null){
		List<Patient_Reg_Pojo> filteredList = StaticData.getAllPatient.stream()
			      .filter(patient_reg -> StaticData.getAllPatient.contains(userName))
			      .collect(Collectors.toList());
		List<Patient_Reg_Pojo> filteredLists=filteredList.stream().filter(patient_Regs->filteredList.contains(gmail)).collect(Collectors.toList());
		
		if(filteredLists.size()==1){
			//write mail service 
			return "your password send to mail";
		}
		else{
			return "Enter Correct Email ID and User Name";
		}
		
		}
		return "Enter Correct  User Name";
	}
	@Override
	public void forgetPassword(String userName, String gmail, String newPassword) throws Exception {
		
		
	}

}
