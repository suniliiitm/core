package com.sp;

import java.util.Scanner;

public class FibanaacciRecursib {
	
	static int a=0,b=1,d;
	
	public static void main(String[] args) {
		System.out.print("Please Enter Any number for Fibanacci Series");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		FibanaacciRecursib.getFibanacciSeries(n);
		System.out.println("\n");
		System.out.println(FibanaacciRecursib.fib(n));
		
	}
	public static void getFibanacciSeries(int n) {
		System.out.print( a+  +b);
		for(int i=2;i<n;i++) {
			d=a+b;
			System.out.print(" "+d);
			a=b;
			b=d;
		}
		
	}
	
	
	public static int fib(int n) {
		
		if(n==0) {
			return n;
		}else if(n==1) {
			return n;
		}else {
			return fib(n-1)+fib(n-2);
		}
		
	}
	
	
}
