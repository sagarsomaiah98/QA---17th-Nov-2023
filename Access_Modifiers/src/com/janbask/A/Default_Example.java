package com.janbask.A;

 class Default_Example {

	 int age=23;
	 String name="Andrew";
	
	void method1() {
		
		System.out.println("method 1");
	}
	
	public static void main(String[] args) {
		
		Default_Example d = new Default_Example();
		System.out.println(d.age);
		System.out.println(d.name);
		d.method1();

	}

}
