package com.sp;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo3 {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("Suman");
		list.add("kajal");
		list.add("sristi");
		list.add("pooja");
		list.add("shilpa");
		//
		list.stream().map(name->name.toUpperCase()+"-"+ name.length()).forEach(System.out::println);

	}

}
