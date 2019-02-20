package com.boilerPlate.app;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootBoilerPlateApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
    private DataSource ds; //작성
	
	@Autowired
    private SqlSessionFactory sqlSession; //작성


	@Test
    public void testConnection() throws Exception{ //작성
        System.out.println("ds : "+ds);
        
        Connection con = ds.getConnection(); //ds(DataSource)에서 Connection을 얻어내고
        
        System.out.println("con : "+con); //확인 후
        
        con.close(); //close
    }
	
	@Test
    public void testSqlSession() throws Exception{//작성
        
        System.out.println("sqlSession : "+sqlSession);
        
    }




	
}

