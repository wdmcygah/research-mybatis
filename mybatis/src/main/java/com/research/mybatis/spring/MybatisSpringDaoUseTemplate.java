package com.research.mybatis.spring;

import org.apache.ibatis.session.SqlSession;

import com.research.mybatis.generator.model.AgentInvokeGenerate;

public class MybatisSpringDaoUseTemplate {

    private SqlSession sqlSession;
    
    public AgentInvokeGenerate getAgentInvokeById(String id){
        return sqlSession.selectOne("com.research.mybatis.generator.dao.AgentInvokeGenerateMapper.selectByPrimaryKey", id);
    }

    public SqlSession getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    } 
    
}
