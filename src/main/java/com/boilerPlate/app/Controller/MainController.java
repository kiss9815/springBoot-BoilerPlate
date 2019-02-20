package com.boilerPlate.app.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MainController {
	
	@RequestMapping(value="/mainTest", method=RequestMethod.GET) 
	public String main() {
		log.info("main");
		log.info("main 33333");
		log.info("main 44444");
		return "thymeleaf/main";
	}
	
	@RequestMapping(value="/mainJsp", method=RequestMethod.GET) 
	public String mainJsp() {
		
		return "jsp/sample";
	}
}
