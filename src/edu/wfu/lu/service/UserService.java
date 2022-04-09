package edu.wfu.lu.service;

import edu.wfu.lu.po.User;

public interface UserService {
	
	//通过账号和密码查询用户
	
	public User findUser(String usercode,String password);

}
