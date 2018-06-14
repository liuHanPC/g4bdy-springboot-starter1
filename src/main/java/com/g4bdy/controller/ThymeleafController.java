package com.g4bdy.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/th")
public class ThymeleafController {
	
	    @RequestMapping("/index")
		public String index(ModelMap map){
	    	map.addAttribute("name", "孙荣----狰狞");
			return "thymeleaf/index";
		}
	    
	    @RequestMapping("/center")
		public String center(){
			return "thymeleaf/center/center";
		}
	    
}
