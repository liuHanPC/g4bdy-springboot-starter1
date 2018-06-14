package com.g4bdy.controller;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.g4bdy.pojo.G4bdyJSONResult;
import com.g4bdy.pojo.User;

@RestController
@RequestMapping("/user")
public class UserController{
		
	    /**
	     * 获取用户信息
	     * @return
	     */
	    @RequestMapping("/getUser")
//	    @ResponseBody
		public User getUser(){
	    	User u = new User();
	    	u.setName("cuipeng");
	    	u.setAge(22);
	    	u.setBrithday(new Date());
	    	u.setPassword("123456");
			return u;
		}
	    
	    
	    /**
	     * 获取用户信息的Json
	     * @return
	     */
	    @RequestMapping("/getUserJson")
//	    @ResponseBody
		public G4bdyJSONResult getUserJson(){
	    	User u = new User();
	    	u.setName("cuipeng2");
	    	u.setAge(25);
	    	u.setBrithday(new Date());
	    	u.setPassword("12345678");
	    	u.setDesc("这家伙很懒，什么也没留下。。。。");
			return G4bdyJSONResult.ok(u);
		}
}
