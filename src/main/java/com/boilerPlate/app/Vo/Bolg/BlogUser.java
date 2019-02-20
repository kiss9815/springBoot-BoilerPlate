package com.boilerPlate.app.Vo.Bolg;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


//회원 
@Getter
@Setter
@ToString
public class BlogUser {

 // 회원 아이디 
 private Integer id;

 // 회원 이름 
 private String name;

 // 회원 이메일 
 private String email;

 // 웹사이트 주소 
 private String website;

}