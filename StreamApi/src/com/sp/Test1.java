package com.sp;

public class Test1 {
	private static volatile int dd=90;
	
	private int id;
	Test1(){
		id=incrementedId();
	}
	
	public synchronized int incrementedId() {
		
		
		return dd++;
		
	}

	public static void main(String[] args) {
		Test1 t= new Test1();
		System.out.println(""+t.incrementedId());

	}
	
	

}
