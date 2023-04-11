package com.sp;

public class SingletonCl {

	public static void main(String[] args) {
		System.out.println(SingletonTest.getInstance().hashCode());
		System.out.println(SingletonTest.getInstance().hashCode());
	}

}
