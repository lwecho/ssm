package edu.wfu.lu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.wfu.lu.dao.UserDao;
import edu.wfu.lu.po.User;
import edu.wfu.lu.service.UserService;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public User findUser(String usercode, String password) {
		
		return this.userDao.findUser(usercode, password);
	}

}
