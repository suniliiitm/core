package com.sp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTerminal {

	public static void main(String[] args) {


		IntStream.of(1,2,3,4,5,6,7,8,9,8).forEach(System.out::println);
		System.out.println("===================");
		List<Integer> numList=Arrays.asList(1,2,3,4,5,6,7,8,9,8);
		List<Integer>squreList	=numList.stream().map(n->n*n).collect(Collectors.toList());
		squreList.forEach(System.out::println);
		List<Integer>uniquesqureList=numList.stream().map(n->n*n).distinct().collect(Collectors.toList());
		uniquesqureList.forEach(System.out::println);
		System.out.println("===================remove duplicates");
		Set<Integer>uniquesqureList1=numList.stream().map(n->n*n).collect(Collectors.toSet());
		uniquesqureList1.forEach(System.out::println);


		System.out.println("---------------------------------------");
		List<String> namelist=new ArrayList<>();

		namelist.add("sunil");
		namelist.add("aman");
		namelist.add("chadini");
		namelist.add("roshini");
		namelist.add("");
		namelist.add("raju");
		namelist.add("");
		namelist.add("ansu");
		long counts  =namelist.stream().filter(n->n.isEmpty()).count();
		System.out.println("Empty Name is:"+counts);

		System.out.println("------------");
		String combinedlist=namelist.stream().filter(n->!n.isEmpty()).collect(Collectors.joining(","));

		System.out.println(combinedlist);
		System.out.println("=================numToInt===================");
		//IntSummaryStatistics summaryStatics	=namelist.stream().mapToInt(n->n).summaryStatistics();
		//System.out.println(summaryStatics.getAverage());
		//System.out.println( summaryStatics.getMax());
		//System.out.println(summaryStatics.getMin());
		//System.out.println( summaryStatics.getCount());

		System.out.println("======I wantOutput as remove comma and from 2onwards first letter as capitals===========");

		String[] st=combinedlist.split(",");
		String f="";
		for(int i=0;i<st.length;i++) {
			if(i!=0) {
				f=f+st[i].toUpperCase().substring(0, 1)+st[i].substring(1);
			}else {
				f=f+st[i];
			}
		}
		System.out.println("FFFFFFFFFFF"+f);

	}		

}
