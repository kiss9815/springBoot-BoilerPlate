package com.boilerPlate.app.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import Util.DbInfo;

@Configuration
public class DbConfig {

	
	
	 @Bean
     public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        //dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/boilerPlate?useSSL=false&characterEncoding=UTF-8&serverTimezone=UTC");
        dataSource.setUrl(DbInfo.DbServerUrl);
        dataSource.setUsername(  DbInfo.DbUser);
        dataSource.setPassword( DbInfo.DbPassword );
        return dataSource;
     }
}
