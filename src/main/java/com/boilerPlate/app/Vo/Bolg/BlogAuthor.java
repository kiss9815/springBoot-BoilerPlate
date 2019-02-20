package com.boilerPlate.app.Vo.Bolg;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//저자
@Getter
@Setter
@ToString
public class BlogAuthor {

 // 저자 아이디 
 private Integer id;
 // 필명 
 private String displayName;
 // 성 
 private String firstName;
 // 이름 
 private String lastName;

}
