package com.research.mybatis.spring;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.research.mybatis.generator.model.User;

//@Repository
public class MybatisSpringDaoUseDaoSupport extends SqlSessionDaoSupport{

    public User getUserById(Integer id){
        return getSqlSession().selectOne("com.research.mybatis.generator.dao.UserMapper.selectByPrimaryKey", id);
    } 
}
