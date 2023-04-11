package com.sp;

@FunctionalInterface
public interface Oper {
	
	void m1();
	
	static void print() {
		System.out.println("static  method executed");
	}
	default void withdraw() {
		System.out.println("hi default with draw");
	}
	default void deposit() {
		System.out.println("hi default with draw");
	}
	
	class Sample implements Oper{
		static void print() {
			System.out.println("override method i am child");
		}
		public void withdraw() {
			System.out.println("hi with draw i am child");
		}
		public void deposit() {
			System.out.println("hi default with draw");
		}
		@Override
		public void m1() {

        System.out.println("hi m1");
			
		}
		
	}
	public static void main(String[] args) {
		
		Sample sam =new Sample();
		sam.m1();
		
		sam.print();
		sam.print();
		sam.withdraw();
		sam.withdraw();
		
		int num=991;
		int count=0;
		while(num!=0) {
			num =num/10;
			count++;
		}
		System.out.println(count);
	}
	

}
