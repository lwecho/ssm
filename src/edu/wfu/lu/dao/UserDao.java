package edu.wfu.lu.dao;

import org.apache.ibatis.annotations.Param;

import edu.wfu.lu.po.User;

public interface UserDao {
	
	//ͨ���˺ź������ѯ�û�
	 
	public User findUser(@Param("usercode") String usercode,
			                @Param("password") String password);
	
	

}
