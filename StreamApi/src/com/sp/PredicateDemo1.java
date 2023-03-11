package com.sp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateDemo1 {

	public static void main(String[] args) {
		String[] names= {"vivek","sunil","aman","dhiru"};

						System.out.println(""+names[1]);;//sunil

		Predicate<String> n= m -> m.charAt(0)=='a';
		Predicate<String>y = g->g.startsWith("d");
		for(String g:names) {
			if(y.test(g)) {
				System.out.println(g);//dhiru
			}
		}

		for(String m:names) {
			if(n.test(m)) {
				System.out.println(m);//aman
			}
		}
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		
		for(Integer ml:myList) {
			                 
			System.out.println(ml);
			
			
		}
			
		
	}

}
