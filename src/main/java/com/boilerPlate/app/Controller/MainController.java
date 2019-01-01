package com.boilerPlate.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
public class MainController {
	
	@RequestMapping(value="/main", method=RequestMethod.GET) 
	public String main() {
		
		return "thymeleaf/main";
	}
	
	@RequestMapping(value="/jsp", method=RequestMethod.GET) 
	public String jsp() {
		
		return "jsp/sample";
	}
}
