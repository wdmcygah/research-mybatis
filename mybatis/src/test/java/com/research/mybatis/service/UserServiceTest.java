package com.research.mybatis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.research.mybatis.generator.dao.UserMapper;
import com.research.mybatis.generator.model.User;

@ContextConfiguration(locations="classpath:/generator/spring/spring-mybatis.xml")
public class UserServiceTest extends AbstractTestNGSpringContextTests{

  @Autowired
  private UserService userService;
  
  @Test
  public void batchInsertUser() {
	  List<User> userList = new ArrayList<User>();
	  User u1 = new User();
	  u1.setName("name1");
	  u1.setAge(10);
	  userList.add(u1);
	  User u2 = new User();
	  u2.setName("name2");
	  u2.setAge(20);
	  userList.add(u2);
	  userService.batchInsertUser(userList);
  }
}
