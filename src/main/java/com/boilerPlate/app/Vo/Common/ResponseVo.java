package com.boilerPlate.app.Vo.Common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ResponseVo {
	
	private String httpStatus;
	
	private Integer responseCode;
	private String responseMsg = "Success";
	
	private Object resultVo;
}
