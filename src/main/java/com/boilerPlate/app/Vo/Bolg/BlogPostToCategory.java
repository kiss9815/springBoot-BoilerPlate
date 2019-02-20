package com.boilerPlate.app.Vo.Bolg;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//게시글 카테고리 
@Getter
@Setter
@ToString
public class BlogPostToCategory {

 // 카테고리 아이디 
 private Integer categoryId;
 // 게시글 아이디 
 private Integer postId;
}
