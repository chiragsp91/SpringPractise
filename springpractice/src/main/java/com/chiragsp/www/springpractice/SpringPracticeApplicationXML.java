package com.chiragsp.www.springpractice;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chiragsp.www.springpracticexml.XMLPersonDAO;


public class SpringPracticeApplicationXML {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringpracticeApplication.class);
	public static void main(String[] args) {
			try(ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("application_context.xml")){
				XMLPersonDAO personDao =  appCon.getBean(XMLPersonDAO.class);
				personDao.getXmljdbcConnection();
				System.out.println(personDao);
				LOGGER.info("BEANS -> {}",
						(Object)appCon.getBeanDefinitionNames());
			}
		
		
		
		
		
	}
}
