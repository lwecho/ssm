package edu.wfu.lu.service;

import edu.wfu.lu.po.User;

public interface UserService {
	
	//ͨ���˺ź������ѯ�û�
	
	public User findUser(String usercode,String password);

}
