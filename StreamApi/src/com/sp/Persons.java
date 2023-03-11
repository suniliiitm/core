package com.sp;

public class Persons {
   private String name;
   private Integer age;
   private String phoneNumber;
   private String address;
   
   

public Persons(String name, Integer age, String phoneNumber,String address) {
	
	this.name = name;
	this.age = age;
	this.phoneNumber = phoneNumber;
	this.address = address;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Persons [name=" + name + ", age=" + age + ", address=" + address + "]";
}

   
   
}
