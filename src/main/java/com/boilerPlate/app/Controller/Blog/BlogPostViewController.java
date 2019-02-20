package com.boilerPlate.app.Controller.Blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BlogPostViewController {
	
	@RequestMapping(value="/blogPost/view", method=RequestMethod.GET) 
	public ModelAndView blogPostView() {
		
		ModelAndView view = new ModelAndView();
		
		view.setViewName("thymeleaf/blogPostView");
		
		return view;
	}
	
}
