package com.research.mybatis.generator.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.research.mybatis.generator.model.User;
import com.research.mybatis.generator.model.UserExt;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //批量插入
	void batchInsert(List<User> userList);

	//批量更新
	void batchUpdate(List<User> userList);

	//批量删除
	void batchDelete(List<User> userList);

	//模糊查询
	List<User> selectLikeName(@Param("name")String name);

	//多条件查询
	List<User> selectUser(@Param("name")String name, @Param("age") int age);

	//联表查询
	List<UserExt> selectUserExt(@Param("name")String name,@Param("age") int age);
}