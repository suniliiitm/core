package com.sp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<Persons>plist=new ArrayList<>();
		plist.add(new Persons("Sunil", 28,"9089899090","Delhi"));
		plist.add(new Persons("Dharm", 27,"9089899090","Pune"));
		plist.add(new Persons("Kumar", 34,"8989776556","Delhi"));
		plist.add(new Persons("Srey", 30,"8778877867","pune"));
		plist.add(new Persons("san", 35,"9090988990","noida"));
		
		//filter persons name whose age>=27 && <=30
		plist.stream().filter(p->p.getAge()>=27 && p.getAge()<=30).forEach(System.out::println);
		
		List<String> getPhoneNumber = plist.stream().map(e->e.getPhoneNumber()).collect(Collectors.toList());
		System.out.println(getPhoneNumber);
		Optional<String> phone=plist.stream().filter(e->e.getAddress().equals("Delhi"))
				.map(Persons::getPhoneNumber).findAny();
	    		
		
	    	System.out.println("====="+phone);	
	    	
	
		
		
        Map<String,List<Persons>> map =plist.stream().collect(Collectors.groupingBy(Persons::getAddress));
  System.out.println(map);	
	}
	
	
	

}
