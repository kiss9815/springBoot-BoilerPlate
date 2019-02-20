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
public class BoardController {
	
	@Autowired
	BoardMapper boardMapper;
	
	
	@RequestMapping(value="/postView", method=RequestMethod.GET) 
	public String main() throws Exception {
		log.info("main");
		log.info("main 33333");
		log.info("main 44444");
		
		
		List<Board> boardList = boardMapper.selectBolardList();
		
		
		
		log.info("board : " + boardList.toString());
		
		
		
		
		return "thymeleaf/postView";
	}
	
	@RequestMapping(value="/postInsert", method=RequestMethod.GET) 
	public ModelAndView postInsert() {
		
		
		log.info("main");
		log.info("main 33333");
		log.info("main 44444");
		
		ModelAndView view = new ModelAndView();
		
		view.setViewName("thymeleaf/postView");
		
		return view;
	}
	
	
	
}
