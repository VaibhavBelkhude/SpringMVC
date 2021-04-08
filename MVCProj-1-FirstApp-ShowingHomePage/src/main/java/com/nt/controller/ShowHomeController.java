package com.nt.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ShowHomeController implements Controller{

@Override
public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
	//blogic
	Date date=new Date();
	arg1.setHeader("Refresh", "2:url=reloadpage");
	return new ModelAndView("home","sysDate",date);
}
}
