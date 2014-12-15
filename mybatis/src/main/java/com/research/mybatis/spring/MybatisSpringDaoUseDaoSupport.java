package com.research.mybatis.spring;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.research.mybatis.generator.model.AgentInvokeGenerate;

@Repository
public class MybatisSpringDaoUseDaoSupport extends SqlSessionDaoSupport{

    public AgentInvokeGenerate getAgentInvokeById(String id){
        return getSqlSession().selectOne("com.research.mybatis.generator.dao.AgentInvokeGenerateMapper.selectByPrimaryKey", id);
    } 
}
