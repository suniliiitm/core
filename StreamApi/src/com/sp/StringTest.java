package com.sp;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="sunil_vivek_suman";
		
		
		
		String f="";
		  String[] s=str.split("_");
		  for(int i=0;i<s.length;i++) {
			  if(i!=0) {
				  f=f+(s[i]).substring(0, 1).toUpperCase()+s[i].substring(1);
			  }else {
				  f=f+s[i];
			  }
		  }
		  System.out.println(f); 
		  
	
	
	}
		 
		
	
		

	
}
