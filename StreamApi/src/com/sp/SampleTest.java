package com.sp;

import java.util.Arrays;



public class SampleTest {
	
	

	public static void main(String[] args) {
		
		                                              
		Car c1 =new Car(10);//false
		Car c2= new Car(10);//false
		String s1= new String("10");
		String s2= new String("10");
		System.out.println(c1==c2);//false
		System.out.println(c1.equals(c2));//false
		System.out.println(s1.intern()==s2.intern());//true
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		int [] arr= {1,2,2,3,5 ,6,6,7,8,9};
		
		
		for(int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j] && i!=j) {
				System.out.println("Dunlicates Found:"+ arr[j]);
			}
			}
			
		}
		//System.out.println(arr[i]+" "+count +"times");
		      
			 int[] array = Arrays.stream(arr).distinct().toArray();
			 
			System.out.println(Arrays.toString(array));
			//System.out.println(uniqueVale);
			
					
			System.out.println(array.length);
	}

}
class Car{
	private int speed;
	
	public Car(int speed) {
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
}