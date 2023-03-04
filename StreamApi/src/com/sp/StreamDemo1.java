package com.sp;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo1 {

	public static void main(String[] args) {
      List<Integer>list	=new ArrayList<>();
      
      list.add(1);
      list.add(12);
      list.add(8);
      list.add(15);
      list.add(3);
      list.stream().filter(e-> e >10).forEach(System.out::println);//12,15
      
      list.forEach(System.out::println);//1,12,15,8,3
	}

}
