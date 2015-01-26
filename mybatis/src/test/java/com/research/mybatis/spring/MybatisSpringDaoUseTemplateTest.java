package com.research.mybatis.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.research.mybatis.generator.model.User;

@ContextConfiguration(locations="classpath:/generator/spring/spring-mybatis.xml")
public class MybatisSpringDaoUseTemplateTest extends AbstractTestNGSpringContextTests{

  @Autowired
  private MybatisSpringDaoUseTemplate dao;
    
  @Test
  public void getAgentInvokeById() {
    int id = 1;
    User ai = dao.getUserById(id);
    Assert.assertTrue("000".equals(ai.getName()));
  }
}
