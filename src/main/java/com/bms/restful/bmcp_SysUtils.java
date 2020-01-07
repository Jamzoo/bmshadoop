package com.bms.restful;



import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;


import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;





@Component
@RestController
@CrossOrigin					//(origins = "http://192.168.1.105:8080", maxAge = 3600)
@RequestMapping(value="/rest")
public class bmcp_SysUtils{
	



	public SqlSessionTemplate SessionFactory;		//db
	@Autowired
	public void initsqlSessionTemplate(@Qualifier("sqlSessionTemplate") SqlSessionTemplate sqlSessionTemplate){
		SessionFactory = sqlSessionTemplate;
	}
	
	public SqlSessionTemplate webSessionFactory;		//门户
	@Autowired
	public void iniwebtsqlSessionTemplate(@Qualifier("web_sqlSessionTemplate") SqlSessionTemplate sqlSessionTemplate){
		webSessionFactory = sqlSessionTemplate;
	}

	public SqlSessionTemplate rtdbSessionFactory;		//报告db
	@Autowired
	public void inirtdbtsqlSessionTemplate(@Qualifier("sqlrtdbSessionTemplate") SqlSessionTemplate sqlSessionTemplate){
		rtdbSessionFactory = sqlSessionTemplate;
	}



 	public Logger log = Logger.getLogger(bmcp_SysUtils.class.getName());
	


	  		 	
	
}