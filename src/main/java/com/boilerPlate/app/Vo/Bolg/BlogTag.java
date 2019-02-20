package com.boilerPlate.app.Vo.Bolg;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//테그 
@Getter
@Setter
@ToString
public class BlogTag {

 // 테그 아이디 
 private Integer id;

 // 게시글 아이디 
 private Integer postId;

 // 테그 내용 
 private String tag;

 // 수정된 태그 내용 
 private String tagClean;

}
