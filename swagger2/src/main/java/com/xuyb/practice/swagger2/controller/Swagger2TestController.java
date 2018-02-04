package com.xuyb.practice.swagger2.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xuyb.practice.swagger2.entities.UserRequestEntity;
import com.xuyb.practice.swagger2.entities.UserResponseEntity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(value="/root")
@Api(value="Swagger2TestController ",tags={"swagger test sample"},description="swagger测试代码")
public class Swagger2TestController {
	
	
	@RequestMapping(value="/testSwagger1",method=RequestMethod.POST)
	@ApiOperation(value="用这个方法演示给Resquest加annotation以便在Swagger中显示",notes="notes,---this is getUserTest2")
	public  UserResponseEntity testSwagger1(
			@ApiParam(value="@RequestBody 是必须写的才能在Swagger内转换成Json格式的入参",name="entity222",required=true)
			@RequestBody UserRequestEntity entity){
		
		UserResponseEntity u=new UserResponseEntity();
		u.setUserId("userIdValue");
		u.setUserSalary(1000);
		u.setUserName(entity.getEmployeeNumber());
		
		return u;
	}
	
	@RequestMapping(value="/testSwagger2",method=RequestMethod.GET)
	@ApiOperation(value="用这个方法演示给Response加annotation以便在Swagger中显示",notes="notes,---this is getUserTest1")
	public  UserResponseEntity testSwagger2(
			@ApiParam(defaultValue="abcde",value="value_description",name="flag2",required=true)
			@RequestParam(value="flag2",required=true) String flag){
		
		UserResponseEntity u=new UserResponseEntity();
		u.setUserId("userIdValue");
		u.setUserSalary(1000);
		u.setUserName(flag);
		
		return u;
	}
	
	
	
	

}
