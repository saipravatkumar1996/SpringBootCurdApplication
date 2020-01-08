package com.hexaphor.service;

public interface Login_Service {

	public void login(String userName,String password)throws Exception;
	
	public String forgetPassword(String userName,String gmail)throws Exception;
	
	public void forgetPassword(String userName,String gmail,String newPassword)throws Exception;
	
	
}
