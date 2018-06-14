package com.g4bdy.controller;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.g4bdy.pojo.G4bdyJSONResult;
import com.g4bdy.pojo.Resource;

@RestController
public class vueController {
	
		@Autowired
	    private Resource res;
	    
	    @RequestMapping("/hello")
		public Object test(){
			return "Hello Vue ~";
		}
	    
	    
	    @RequestMapping("/getResource")
		public G4bdyJSONResult getResource(){
	    	Resource bean = new Resource();
	    	BeanUtils.copyProperties(res, bean);
			return G4bdyJSONResult.ok(bean);
		}
	    
}
