package com.chiragsp.www.springpractice;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.chiragsp.www.springpractice.sort.BinarySearchImpl;
import com.chiragsp.www.springpractice.sort.SortAlgorithm;

@SpringBootApplication
public class SpringpracticeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringpracticeApplication.class);
	public static void main(String[] args) {
		ApplicationContext appCon = SpringApplication.run(SpringpracticeApplication.class, args);
		BinarySearchImpl binarySearch =  appCon.getBean(BinarySearchImpl.class);
		//System.out.println(binarySearch);
		SortAlgorithm sortAlgo1 =  binarySearch.binarySearch();
		BinarySearchImpl binarySearch2 =  appCon.getBean(BinarySearchImpl.class);
		SortAlgorithm sortAlgo2 =  binarySearch2.binarySearch();
		//System.out.println(binarySearch2);
		
		LOGGER.info("{}",binarySearch);
		LOGGER.info("{}",binarySearch2);
		LOGGER.info("{}",sortAlgo1);
		LOGGER.info("{}",sortAlgo2);
		
		
	}
}
