package com.research.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.research.mybatis.generator.dao.UserMapper;
import com.research.mybatis.generator.model.User;

/**
 * 用户处理类
 *
 */
@Service
public class UserService {
	@Autowired
    private UserMapper userMapper;
	
	public void batchInsertUser(List<User> userList){
		userMapper.batchInsert(userList);
	}
}
