package com.sp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class A {
public static void main(String[] args) {
	 List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,9,9);
	   //only duplicates remove means getting distinct value
	   List<Integer> dupnUmber=num.stream().distinct().collect(Collectors.toList());
	  
	   System.out.println(dupnUmber);
	   List<Integer> collectDup = num.stream().filter(i->Collections.frequency(num, i)>1).distinct().collect(Collectors.toList());
	   System.out.println("Duplicates found: "+collectDup);
}	
  

	
}
