package com.hexaphor.Global;

import java.util.ArrayList;
import java.util.List;

import com.hexaphor.pojo.Login_User_Pojo;
import com.hexaphor.pojo.Patient_Reg_Pojo;

public class  StaticData {
	
	public static  List<Patient_Reg_Pojo> getAllPatient=new ArrayList<Patient_Reg_Pojo>();
	public static Patient_Reg_Pojo patientByID=new Patient_Reg_Pojo();
	public static List<Login_User_Pojo> GetAllLoginUser=new ArrayList<Login_User_Pojo>();
	public static Login_User_Pojo GetLoginUserByUserName=new Login_User_Pojo();

}
