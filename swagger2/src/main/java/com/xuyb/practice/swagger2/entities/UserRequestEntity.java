package com.xuyb.practice.swagger2.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="UserRequestEntity",description="入参Entity")
public class UserRequestEntity {
	
	@ApiModelProperty(value="员工工号",example="00123456")
	private String employeeNumber;

	@ApiModelProperty(value="员工的W3Account账号",example="c00123456")
	private String w3Account;
	
	
	public String getW3Account() {
		return w3Account;
	}

	public void setW3Account(String w3Account) {
		this.w3Account = w3Account;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	

}
