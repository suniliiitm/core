package com.sp;


class A{ 
	int val = 10;  
	void print(){
		System.out.println("A");
}
}
class B extends A{
int val = 20;
void print(){
System.out.println("B");
}
}
public class C {

	public static void main(String[] args) {
		
		A a=new B();
		
		System.out.println(a.val);
		
		a.print();
		/*
		 * List<Integer> num = new ArrayList<Integer>(); num.add(1); num.add(2);
		 * num.add(3); num.add(4); num.add(5); num.add(6); num.add(3); num.add(4);
		 * num.add(5); num.add(6); List<Integer> collect =
		 * num.stream().distinct().collect(Collectors.toList());
		 * System.out.println(collect);
		 * 
		 * for (int i =0; i< num.size()-1; i++){
		 * 
		 * if(num.get(i)==4){
		 * 
		 * num.remove(i);
		 * 
		 * } } System.out.println(num);
		 */
	}

}
