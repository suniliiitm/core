package com.sp;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestOccu {

	public static void main(String[] args) {
		TestOccu tt=new TestOccu();
		System.out.println(tt.name("sunil"));
		tt.name(70);
		
		String s="sunilsunilvivek";
		Map<String,Long>map  =Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		System.out.println(map);
		//find dupplicates
		List<String> dup =Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		
		System.out.println(dup);
	}
    public String name(String name) {
    	return "";
    }
       public int  name(int name) {
		return name;
    	   
    }
}
