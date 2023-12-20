package com.janbask.C;

public class HelloWorld {

	protected int age=23;
	protected String name="John";
	
	protected void method1() {
		
		System.out.println("hello world  calling method 1");
	}
	
	protected void method2() {
		
		System.out.println("calling method 2");
	}
	public static void main(String[] args) {
		
		HelloWorld h = new HelloWorld();
		
		h.method1();

	}

}
