package com.javaintro;

public class MethodInvocationDemo {
	
	static void staticMethod1() {
		System.out.println("static method 1 called");
	}
	
	static void staticMethod2() {
		staticMethod1();
		System.out.println("static method 2 called");
	}
	
	void instanceMethod1() {
		staticMethod2();
		System.out.println("instane method 1 called");
	}
	
	void instanceMethod2() {
		MethodInvocationDemo obj1 = new MethodInvocationDemo();
		obj1.instanceMethod1();
		
		System.out.println("instance method 2 called");
	}
	
	
	public static void main(String[] args) {
System.out.println("main method started");
		MethodInvocationDemo obj = new MethodInvocationDemo();
		obj.instanceMethod2();
		
System.out.println("main method ended");
	}

}
