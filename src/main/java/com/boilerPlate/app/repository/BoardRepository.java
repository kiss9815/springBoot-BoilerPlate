package com.boilerPlate.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boilerPlate.app.Vo.Jpa.BoardJpa;

public interface BoardRepository extends JpaRepository<BoardJpa, Long> {
	
	List<BoardJpa> findByNameLike(String name);
	
}
