package com.sp;

import java.util.LinkedHashMap;
import java.util.Map;

public class Stream4 {

	public static void main(String[] args) {
		String s ="sunnil_prajapati_schcool_prajapati";
		String[] st=s.split("_");
		String f="";
					
		Map<String, Integer> smap=new LinkedHashMap<>();
		
		//find duplicates words
		for(String ss:st) {
			if(smap.containsKey(ss)==true) {
				smap.put(ss,smap.get(ss)+1);
			}else {
				smap.put(ss, 1);
			}
		}
		System.out.println("====================");
		System.out.println(smap);
		
		for(int i=0;i<st.length;i++) {
			if(i!=0) {
				f=f+st[i].substring(0, 1).toUpperCase()+st[i].substring(1);
			}else {
				f=f+st[i];
			}
		}
		System.out.println(f);
		
		//find duplicates character for coccurances times
		Map<Character, Integer> findchar=new LinkedHashMap<>();
			for(int i=0;i<s.length()-1;i++) {
				      char cc= s.charAt(i);
				      if(findchar.get(cc)!=null) {
				    	  findchar.put(cc, findchar.get(cc)+1);
				      }else 
				      {
				    	  findchar.put(cc, 1);
				      }
			}
			System.out.println("==========="+findchar);
	}

}
