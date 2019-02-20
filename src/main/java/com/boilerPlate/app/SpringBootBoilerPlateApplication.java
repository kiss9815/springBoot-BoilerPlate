package com.boilerPlate.app;

import java.util.Arrays;
import java.util.Locale;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.boilerPlate.app.Controller.ReactiveController;

import lombok.extern.slf4j.Slf4j;
	
@Slf4j
@SpringBootApplication
@Configuration
@EnableWebFlux
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})  // Datasource설정은 자동설정에서 제외 
@ComponentScan(basePackages = "com.boilerPlate.app")
@MapperScan(value = {"com.boilerPlate.app.Mapper"})
public class SpringBootBoilerPlateApplication  implements WebFluxConfigurer {

	public static void main(String[] args) {			
		ApplicationContext ctx = SpringApplication.run(SpringBootBoilerPlateApplication.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			log.info(beanName);
		}
		log.info("main start");
		log.info("main start");
	}
	
	 /**
     * SqlSessionFactory 설정
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource)throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
            sessionFactory.setDataSource(dataSource);
            Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*Mapper.xml");
            
            sessionFactory.setMapperLocations(res);
            return sessionFactory.getObject();
    }
    

	
	@Bean
	public LocaleResolver localeResolver() {
		SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
		sessionLocaleResolver.setDefaultLocale(Locale.KOREAN); //session 으로 locale 판단
        
		return sessionLocaleResolver;
	}
//	@Bean
//	CommandLineRunner initData(StockMongoReactiveCrudRepository mongoRepository) {
//		return (p) -> {
//			mongoRepository.deleteAll().block();
//			mongoRepository.save(new Stock("IBM", "IBM Corporation", "Desc")).block();
//			mongoRepository.save(new Stock("GGL", "Google", "Desc")).block();
//			mongoRepository.save(new Stock("MST", "Microsoft", "Desc")).block();
//		};
//	}
	
	   

	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("messages");
		messageSource.setUseCodeAsDefaultMessage(true);
		return messageSource;
	}
	
	@Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        return lci;
    }

}

