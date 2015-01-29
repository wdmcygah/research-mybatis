package com.research.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.research.mybatis.generator.dao.UserMapper;
import com.research.mybatis.generator.model.User;
import com.research.mybatis.generator.model.UserExt;

/**
 * 用户处理类
 *
 */
@Service
public class UserService {
	@Autowired
    private UserMapper userMapper;
	
	/**
	 * 批量插入
	 * @param userList
	 */
	public void batchInsertUser(List<User> userList){
		userMapper.batchInsert(userList);
	}
	
	/**
	 * 根据主键进行更新
	 * @param userList
	 */
	public void batchUpdateUser( List<User> userList ){
		userMapper.batchUpdate(userList);
	}
	
	public void batchDeleteUser( List<User> userList ){
		userMapper.batchDelete(userList);
	}
	
	public List<User> getUserLikeName(String name){
		return userMapper.selectLikeName(name);
	}
	
	public List<User> getUser( String name, int age ){
		return userMapper.selectUser(name,age);
	}
	
	public List<UserExt> getUserExt( String name, int age ){
		return userMapper.selectUserExt(name,age);
	}
}
