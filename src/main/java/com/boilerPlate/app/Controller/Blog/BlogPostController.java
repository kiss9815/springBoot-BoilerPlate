package com.boilerPlate.app.Controller.Blog;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.boilerPlate.app.Mapper.Blog.BlogPostMapper;
import com.boilerPlate.app.Vo.Bolg.BlogPost;
import com.boilerPlate.app.Vo.Common.ResponseVo;

import Util.ErrCode;
import Util.SuccessCode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/blogPost")
public class BlogPostController {

	
	@Autowired
	BlogPostMapper blogPostMapper;
	
	@RequestMapping(value="/select", method=RequestMethod.GET) 
	public ResponseVo blogPostView(ResponseVo responseVo) {
		
		BlogPost blogPost = new BlogPost();
		blogPost.setId(1);
		blogPost.setTitle("이름입니다.");
		
		responseVo.setResultVo(blogPost);
		
		return responseVo;
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET) 
	public ResponseVo blogPostDelete(BlogPost blogPost) throws Exception {
		
		blogPostMapper.delete(blogPost);
		
		ResponseVo responseVo = new ResponseVo();
		responseVo.setResponseCode(SuccessCode.SUCCESS);
		
		return responseVo;
	}
	
	@RequestMapping(value="/insert", method= {RequestMethod.GET, RequestMethod.POST}) 
	public ResponseVo blogPostInsert(BlogPost blogPost) throws Exception {
		
		ResponseVo responseVo = new ResponseVo();
		try {
			blogPost.setTitle("이름입니다.");
			blogPost.setAuthorId(0001);
			blogPost.setFeatured(0001);
			blogPost.setEnabled(0001);
			blogPost.setCommentsEnabled(0001);
			
			int result = blogPostMapper.insert(blogPost);
			if(result == 1) {
				responseVo.setResponseCode(SuccessCode.SUCCESS);
			}else {
				responseVo.setResponseCode(ErrCode.UPDATED);
			}
			
		}catch (Exception e) {
			responseVo.setResponseCode(ErrCode.ERR);
			log.error(e.toString());
		}
		
		return responseVo;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET) 
	public ResponseVo blogPostUpdate() throws Exception{
		
		ResponseVo responseVo = new ResponseVo();
		responseVo.setResponseCode(SuccessCode.SUCCESS);
		
		return responseVo;
	}
}
