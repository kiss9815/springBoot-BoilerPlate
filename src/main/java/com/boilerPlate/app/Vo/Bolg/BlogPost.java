package com.boilerPlate.app.Vo.Bolg;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//게시글 
@Getter
@Setter
@ToString
public class BlogPost {

 // 게시글 아이디 
 private Integer id;
 // 게시글 제목 
 private String title;
 // 게시글 내용 
 private String article;
 // 수정된 게시글 제목 
 private String titleClean;
 // 첨부 파일 
 private String file;
 // 저자 아이디 
 private Integer authorId;
 // 공개 일자 
 private Timestamp datePublished;
 // 광고 이미지 
 private String bannerImage;
 // 특징 
 private Integer featured;
 // 활성화 여부 
 private Integer enabled;
 // 댓글 가능 여부 
 private Integer commentsEnabled;
 // 읽은 횟수 
 private Integer views;
}
