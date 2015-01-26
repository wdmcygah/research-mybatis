package com.research.mybatis.spring;

import org.apache.ibatis.session.SqlSession;

import com.research.mybatis.generator.model.User;

public class MybatisSpringDaoUseTemplate {

    private SqlSession sqlSession;
    
    public User getUserById(Integer id){
        return sqlSession.selectOne("com.research.mybatis.generator.dao.UserMapper.selectByPrimaryKey", id);
    }

    public SqlSession getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    } 
    
}
