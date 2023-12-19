package com.ty;

import java.util.List;

public class Student {
	private String name;
	private List<String> subname;
	
	public Student(String name, List<String> subname) {
		this.name = name;
		this.subname = subname;
	}
	
	public void display() {
		System.out.println("Name is : "+name);
		System.out.println("============== Subject ==============");
		for(String subject : subname) {
			System.out.println(subject);
		}
		
	}
	
	
	
	

}
