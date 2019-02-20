package com.boilerPlate.app.Vo.Bolg;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//댓글 
@Getter
@Setter
@ToString
public class BlogComment {

 // 댓글 아이디 
 private Integer id;
 // 게시글 아이디 
 private Integer postId;
 // 원본 댓글 아이디 
 private Integer isReplyToId;
 // 댓글 내용 
 private String comment;
 // 회원 아이디 
 private Integer userId;
 // 읽음 표시 
 private Boolean markRead;
 // 활성화 여부 
 private Boolean enabled;
 // 등록일 
 private Timestamp date;

}
