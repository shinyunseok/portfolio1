package com.company.biz.user;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertUser(User user) {
		System.out.println("UserDAO insertUser");
		mybatis.insert("insertUser", user);
	}
	
	public User login(User user) {
		System.out.println("UserDAO login");
		return mybatis.selectOne("login", user);
	}
}
