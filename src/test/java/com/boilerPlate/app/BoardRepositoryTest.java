package com.boilerPlate.app;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.boilerPlate.app.Vo.Jpa.BoardJpa;
import com.boilerPlate.app.repository.BoardRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE) //내장 DB가 아니라 실제 DB를 사용할 경우
public class BoardRepositoryTest {

	@Autowired
	BoardRepository repository;
	
	@Test
	public void testSave() {
		BoardJpa board = new BoardJpa();
		board.setName("이건 jpa 글이다");
		board.setContent("이건 글이다요");
		//assertThat(board.isNew()).isTrue();
		
		repository.save(board);
	}
}
