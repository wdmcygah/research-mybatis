package com.research.mybatis.generator.dao;

import java.util.List;

import com.research.mybatis.generator.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //批量插入
	void batchInsert(List<User> userList);
}