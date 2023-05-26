package com.company.biz.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	
	@Insert("INSERT INTO USERS(user_id,password,user_name,user_number,email,user_birthdate,user_gender) VALUES (#{user_id},#{password},#{user_name},#{user_number},#{email},#{user_birthdate},#{user_gender})")
	public void insertUser(User user);
	
	@Select("SELECT * FROM USERS WHERE USER_ID = #{user_id} AND PASSWORD = #{password}")
	public User login(User user);
	
	
}
