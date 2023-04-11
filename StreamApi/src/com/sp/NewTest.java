package com.sp;

import java.util.LinkedHashMap;
import java.util.Map;

public class NewTest {

	public static void main(String[] args) {

		Map<Integer,String> map=new LinkedHashMap<>();
		
		map.put(null, null);
		map.put(null, null);
		map.put(null, null);
		
		map.put(1, null);
		map.put(2, "sunil");
		for(Map.Entry<Integer,String> entry:map.entrySet()) {
			Integer key=entry.getKey();
			System.out.println("Keys:"+key);
			String value=entry.getValue();
			System.out.println("Values:"+value);
			
		} 
		
		
		
		
	}

	

}
