package com.xuyb.practice.swagger2.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="UserResponseEntity aa",description="user返回值对象")
public class UserResponseEntity {
	
	@ApiModelProperty(value="用户ID",name="userId2",example="1234567890")
	private String userId;
	
	@ApiModelProperty(value="用户名",example="xuyongbo")
	private String userName;
	
	@ApiModelProperty(value="用户工资",example="200")
	private int userSalary;


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getUserSalary() {
		return userSalary;
	}


	public void setUserSalary(int userSalary) {
		this.userSalary = userSalary;
	}
	

}
