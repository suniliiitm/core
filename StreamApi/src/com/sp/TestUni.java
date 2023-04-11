package com.sp
;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestUni {

	public static void main(String[] args) {
		
		       String s="sunilgauravji";
				char ch[]=s.toCharArray();
				
			   Set<Character> ch1=new LinkedHashSet<>();
			
					for(char cd:ch) {
						ch1.add(cd);
					}
					System.out.println(ch1);
					System.out.println(s);
	}

}
