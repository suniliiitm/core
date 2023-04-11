package com.sp;

public class SingletonTest {
	public volatile static SingletonTest instance;
	
	private SingletonTest() {
		
	}
	
	/*
	 * public static SingletonTest getInstance() { if(instance == null) { instance =
	 * new SingletonTest(); } return instance; }
	 */
	//double locking
	/*
	 * public static SingletonTest getInstance(){ if(instance == null) {
	 * synchronized (SingletonTest.class) { if(instance==null) { instance= new
	 * SingletonTest(); }
	 * 
	 * }
	 * 
	 * } return instance;
	 * 
	 * }
	 */
	
	public static SingletonTest getInstance(){
		if(instance == null) {
			synchronized (SingletonTest.class) {
				if(instance == null) {
					instance = new SingletonTest();
				}
				
			}
		}
		
		return instance;
		
	}		
	
	
}
