package com.nt.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
/*	
//1)@RequestMapping is case sensitive
  
	@RequestMapping("welcome")
	public   String   showHome() {
		return "home";
	}
	
	@RequestMapping("WELCOME")
	public   String   showHome2() {
		return "home2";
	}*/
//==================================================
	//we can not take multiple handler method with same path/uri request having same request method/mode
/*	@RequestMapping("welcome")
	public   String   showHome() {
		return "home";
	}
	
	@RequestMapping("welcome")
	public   String   showHome2() {
		return "home2";
	}*/
	/* Exception occure:
	java.lang.IllegalStateException: Ambiguous mapping. 
	                          Cannot map 'testController' method 
	com.nt.controller.TestController#showHome2()
	to { [/welcome]}: There is already 'testController' bean method
	com.nt.controller.TestController#showHome() mapped.*/
//======================================================================
//we can  take multiple handler method with same path/uri but they should having differnt request modes likes:Get/Post
	@RequestMapping("/welcome")
	public   String   showHome() {
		return "home";
	}
	
	@RequestMapping("/register")  //get
	public   String   saveData1() {
		return "result";
	}

	@RequestMapping(value="/register",method = RequestMethod.POST)  //POST  
	public   String   saveData2() {
		return 	"result2";
	}






}//class