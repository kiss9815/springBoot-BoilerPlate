package com.boilerPlate.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.boilerPlate.app.Mapper.BoardMapper;
import com.boilerPlate.app.Vo.Board;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BoardJpaController {
	
	@RequestMapping(value="/boardJpaView", method=RequestMethod.GET) 
	public String main() throws Exception {
		log.info("main");
		log.info("main 33333");
		log.info("main 44444");
		
		
		
		
		
		
		return "thymeleaf/postView";
	}
	
}
