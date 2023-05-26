package com.company.biz.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserMapper {
	
	@Autowired
	UserDAO userDAO;
	
	@Override
	public void insertUser(User user) { // 회원가입
		System.out.println("UserService insertUser");
		userDAO.insertUser(user);
	}

	@Override
	public User login(User user) { // 로그인
		System.out.println("service login");
		return userDAO.login(user);
	}

}
