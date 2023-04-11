package com.sp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class EvenNumber {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sumofEvenNumber =asList.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(sumofEvenNumber);
		
		Set<Integer> ss= new LinkedHashSet<>();
		ss.add(2);
		ss.add(2);
		for(Integer s:ss) {
			System.out.println(s);
		}
	Map<String,Integer>emp	=new HashMap<>();
	emp.put("sun",12);
	emp.put("sun", 13);
	emp.put(null, null);
	emp.put(null, 11);
	emp.put(null, 12);
	for(Map.Entry<String,Integer>ee:emp.entrySet()) {
		System.out.println(ee.getKey()+" "+ee.getValue());
	}
	
	}

}
