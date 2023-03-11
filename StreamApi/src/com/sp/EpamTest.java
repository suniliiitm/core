package com.sp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class EpamTest {

	public static void main(String[] args) {
		
		List<Integer>list = Arrays.asList(10,20,30,15,50);
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			String s1 = list.get(i)+"";
			if( (s1.substring(0, 1)) .equals (1+"") ) {
				System.out.println(list.get(i));
			}
		}
		
		//list.stream().map(null);
		//	Predicate<Integer>ll=n->n.startsWith(1);
			String s="aman_singh_rajput";
			String[] st=s.split("_");
			System.out.println(st);
			String f=" ";
			for(int i=0;i<st.length;i++) {
				if(i!=0) {
					f=f+st[i].substring(0, 1).toUpperCase()+st[i].substring(1);
				}else {
					f=f+st[i];
				}
			}
		System.out.println(f);
		
		
	}

}
