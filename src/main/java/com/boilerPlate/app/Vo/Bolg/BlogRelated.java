package com.boilerPlate.app.Vo.Bolg;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//연결정보 게시글과 연결된 다른 게시글
@Getter
@Setter
@ToString
public class BlogRelated {

 // 게시글 아이디 
 private Integer blogPostId;
 // 연결된 게시글 아이디 
 private Integer blogRelatedPostId;

}
