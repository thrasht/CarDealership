package com.mpersd.agenciadeautos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mpersd.agenciadeautos.dao.UserDao;

@Service("userService")
@Transactional
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao udao;
	
	
}
