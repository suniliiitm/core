package com.sp;

import java.util.Arrays;

public class EvenNumbersumfromArrays {

	public static void main(String[] args) {
	int[] num = {1,2,3,4,5,6,7,8,9};
	int [] num1 = {11,22,33,3,5,6,7};
	
	
	int sum = Arrays.stream(num).filter(n->n % 2 == 0).sum();
	
	System.out.println(""+sum);
	int[] merge=new int[num.length +num1.length];
	
	System.arraycopy(num, 0, merge, 0, num.length);
	System.arraycopy(num1, 0, merge, num.length, num1.length);
	
	
Arrays.sort(merge);
	for(int mm:merge) {
		System.out.print(mm);
	}
	
	

	}

}
