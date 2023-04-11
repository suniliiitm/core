package com.sp;

import java.util.LinkedHashSet;
import java.util.Set;

public class Palin {

	public static void main(String[] args) {
		String str="racecar";
		if(isPalindrome(str)) {
			System.out.println(str +" is palindrome");
		}else {
			System.out.println(str +" is palindrome");
		}
		String str1="Apple";
			char[] charArray = str1.toCharArray();
		Set<Character> ch = new LinkedHashSet<>();
		for(Character cc:charArray) {
			System.out.println(cc);
			ch.add(cc);
		}
		reverse("Apple");
		


	}
	public static boolean isPalindrome(String s) {
		
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
		
	}
	 public static void reverse(String str1) {
		 char[] arr=str1.toCharArray();
		 		String ss="";
		 for(int i=arr.length-1;i>=0;i-- ) {
			 ss+= arr[i];
		 }
		 System.out.println(ss);
	 }
}
