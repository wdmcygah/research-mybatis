package com.research.mybatis.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.research.mybatis.generator.dao.UserMapper;
import com.research.mybatis.generator.model.User;

//@Repository
public class MybatisSpringDaoUseMapper {

    @Autowired
    private UserMapper mapper;
    
    public User getUserById(Integer id){
        return mapper.selectByPrimaryKey(id);
    }
}
