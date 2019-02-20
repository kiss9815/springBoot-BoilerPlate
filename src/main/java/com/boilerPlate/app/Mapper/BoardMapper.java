package com.boilerPlate.app.Mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.boilerPlate.app.Vo.Board;

public interface BoardMapper {

	public List<Board> selectBolardList() throws Exception;
	
}
