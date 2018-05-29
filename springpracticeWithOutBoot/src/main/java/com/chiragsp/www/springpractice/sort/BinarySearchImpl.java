package com.chiragsp.www.springpractice.sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm bubbleSortAlgorithm;
	
	public SortAlgorithm binarySearch(){
		return bubbleSortAlgorithm;
	}
	public String print(){
		return "print";
	}
}
