package com.janbask.D;

import com.janbask.A.Protected_Example;
import com.janbask.C.HelloWorld;

public class Run extends Protected_Example {

	public static void main(String[] args) {
		
		/*
		 * Protected_Example p = new Protected_Example(); p.method1();
		 * System.out.println(p.age); System.out.println(p.name);
		 */
		
		Run r = new Run();
		r.method1();
		System.out.println(r.age);
		System.out.println(r.name);

	}

}
