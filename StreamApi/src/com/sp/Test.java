package com.sp;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		//for(Integer l:list) {
			//if(l.equals(4)) {
				//fale fast if modification in Arraylist modification in current object
				//list.add(6);
			//}
			
		//}
		Set<Integer> ss= new LinkedHashSet<>();
		ss.add(1);
		ss.add(2);
		ss.add(3);
		ss.add(4);
		ss.add(5);
		System.out.println(ss);
		for(Integer s:ss) {
			if(s.equals(3)) {
			//fale fast in set cocurrent modification 
				ss.add(6);
			}
		}
		
		
	}

}
