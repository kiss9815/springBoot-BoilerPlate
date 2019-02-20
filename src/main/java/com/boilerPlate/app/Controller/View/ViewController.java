package com.boilerPlate.app.Controller.View;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ViewController {
	
	@RequestMapping(value="/main", method=RequestMethod.GET) 
	public ModelAndView blogPostView() {
		
		ModelAndView view = new ModelAndView();
		
		view.setViewName("thymeleaf/main");
		
		return view;
	}
	
}
