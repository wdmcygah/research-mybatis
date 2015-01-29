package com.research.mybatis.generator.model;

public class UserExt extends User{

	//部门编码
    private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}