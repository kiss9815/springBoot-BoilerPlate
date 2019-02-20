package com.boilerPlate.app.Mapper.Blog;

import java.util.List;

import com.boilerPlate.app.Vo.Bolg.BlogPost;

public interface BlogPostMapper {

	public List<BlogPost> selectBlogPostList(BlogPost blogPost) throws Exception;
	public int delete(BlogPost blogPost) throws Exception;
	public int insert(BlogPost blogPost) throws Exception;
//	public BlogPost selectBlogPostById(BlogPost blogPost) throws Exception;
}
