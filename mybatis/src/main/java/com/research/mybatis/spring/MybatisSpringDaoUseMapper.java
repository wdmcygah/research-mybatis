package com.research.mybatis.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.research.mybatis.generator.dao.AgentInvokeGenerateMapper;
import com.research.mybatis.generator.model.AgentInvokeGenerate;

@Repository
public class MybatisSpringDaoUseMapper {

    @Autowired
    private AgentInvokeGenerateMapper mapper;
    
    public AgentInvokeGenerate getAgentInvokeById(String id){
        return mapper.selectByPrimaryKey(id);
    }
}
