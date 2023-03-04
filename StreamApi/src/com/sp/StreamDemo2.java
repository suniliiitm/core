package com.sp;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<Persons>plist=new ArrayList<>();
		plist.add(new Persons("Sunil", 28));
		plist.add(new Persons("Dharm", 27));
		plist.add(new Persons("Kumar", 34));
		plist.add(new Persons("Srey", 30));
		plist.add(new Persons("san", 35));
		
		//filter persons name whose age>=27 && <=30
		plist.stream().filter(p->p.getAge()>=27 && p.getAge()<=30).forEach(System.out::println);
	}

}
