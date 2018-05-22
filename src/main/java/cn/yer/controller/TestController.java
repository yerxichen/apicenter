package cn.yer.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.yer.entity.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/users")
public class TestController {


	@ApiOperation(value = "获取用户列表", notes = "获取全部的用户数据")
	@RequestMapping(value ="/list", method = RequestMethod.GET)
	public String getUserList() {
		return "我是用户列表结果";
	}
	
	@ApiOperation(value = "新增用户", notes = "新增一个用户root 123456")
	@ApiImplicitParams({
		@ApiImplicitParam(name="name",value="用户名",required=true,paramType="query"),
		@ApiImplicitParam(name="password",value="密码",required=true,paramType="query")
	})
	@RequestMapping(value ="/add", method = RequestMethod.PUT)
	public String addUser(@RequestParam String name,@RequestParam String password) {
		String res="";
		if(name.equals("root")&&password.equals("123456")) {
			res="插入成功";
		}else {
			res="插入失败";
		}
		return res;
	}
	
	@ApiOperation(value="更新用户")
	@RequestMapping(value ="/update", method = RequestMethod.POST)
	public String updateUser(@RequestBody User user) {
		String res="";
		if(user.getId()==1) {
			res="更新用户数据成功";
		}else {
			res="更新用户数据失败";
		}
		
		return res;
	}
}
