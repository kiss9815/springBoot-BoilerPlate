package com.boilerPlate.app.Vo.Bolg;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//카테고리 
@Getter
@Setter
@ToString
public class BlogCategory {

 // 카테고리 아이디 
 private Integer id;

 // 카테고리 이름 
 private String name;

 // 수정된 카테고리 이름 
 private String nameClean;

 // 활성화 여부 
 private Boolean enabled;

 // 등록일 
 private Timestamp dateCreated;

}
