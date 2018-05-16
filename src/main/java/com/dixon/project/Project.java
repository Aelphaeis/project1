package com.dixon.project;

public class Project {
	
	/*private static final Logger logger = LogManager.getLogger();
	//com.dixon.project.Project$Person@67784306
	*/
	
	//Example 1 Start
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Person anthony = new Person();		
		anthony.name = "Anthony";		
		anthony.age = 24;
		anthony.f = 23;
		
		Person miranda = new Person();
		miranda.name = "Miranda";
		
		System.out.println(anthony.name);
		System.out.println(anthony.age);
		System.out.println(miranda.name);
		System.out.println(miranda.age);
		System.out.println(anthony.f);
	
	}
	
	
	public static class Person {
		
		int age;
		String name;
		float f;
		
	}
		
}
