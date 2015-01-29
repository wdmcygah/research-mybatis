package com.research.mybatis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.research.mybatis.generator.model.User;
import com.research.mybatis.generator.model.UserExt;

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
	  u1.setDeptCode("d1");
	  userList.add(u1);
	  User u2 = new User();
	  u2.setName("name2");
	  u2.setAge(20);
	  u2.setDeptCode("d2");
	  userList.add(u2);
	  userService.batchInsertUser(userList);
  }
  
  @Test
  public void batchUpdateUser() {
	  List<User> userList = new ArrayList<User>();
	  User u1 = new User();
	  u1.setId(1);
	  u1.setName("upname1");
	  u1.setAge(10);
	  u1.setDeptCode("d1");
	  userList.add(u1);
	  User u2 = new User();
	  u2.setId(2);
	  u2.setName("upname2");
	  u2.setAge(20);
	  u2.setDeptCode("d2");
	  userList.add(u2);
	  userService.batchUpdateUser(userList);
  }
  
  @Test
  public void batchDeleteUser() {
	  List<User> userList = new ArrayList<User>();
	  User u1 = new User();
	  u1.setId(1);
	  userList.add(u1);
	  User u2 = new User();
	  u2.setId(2);
	  userList.add(u2);
	  userService.batchDeleteUser(userList);
  } 
  
  @Test
  public void getUserLikeName() {
	  String name = "am";
	  List<User> list = userService.getUserLikeName(name);
	  Assert.assertNotNull(list);
  } 
  
  @Test
  public void getUser() {
	  String name = "name1";
	  int age = 10;
	  List<User> list = userService.getUser(name,age);
	  Assert.assertNotNull(list);
  }
  
  @Test
  public void getUserExt() {
	  int age = 10;
	  List<UserExt> list = userService.getUserExt(null,age);
	  Assert.assertNotNull(list);
  }
}
