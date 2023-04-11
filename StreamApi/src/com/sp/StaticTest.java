package com.sp;

public class StaticTest {
		static int a;
		static int b;
		
		static void m1() {
			a=10;
			b=20;
			System.out.println(a);
		}
		static void m2(int x ,int y) {
			a=x;
			b=y;
			//System.out.println(a);
		}
		static void m3(int a,int b) {
			a=a;
			b=b;
			System.out.println(a);
		}
		static void m4(int a,int b) {
			StaticTest.a=a;
			StaticTest.b=b;
			System.out.println(a);
		}
	public static void main(String[] args) {
		
		System.out.println(a+""+b);
		System.out.println("ooooooooooooooooo");
		m1();
		System.out.println(a+"  "+b);
		m2(30,40);
			
	}

}
