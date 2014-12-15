package com.research.mybatis.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.research.mybatis.generator.model.AgentInvokeGenerate;

@ContextConfiguration(locations="classpath:/generator/spring/spring-mybatis.xml")
public class MybatisSpringDaoUseMapperTest extends AbstractTestNGSpringContextTests{

  @Autowired
  private MybatisSpringDaoUseMapper dao;
    
  @Test
  public void getAgentInvokeById() {
    String id = "trigger01";
    AgentInvokeGenerate ai = dao.getAgentInvokeById(id);
    Assert.assertTrue("000".equals(ai.getDbFlag()));
  }
}
