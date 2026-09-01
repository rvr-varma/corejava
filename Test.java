package com.javaintro;

//Static blocks And instance blocks 
public class Test { 
	
	{
		System.out.println("max verstappen"); // instance block
	}
	
	// static block
	static   {
		System.out.println("tuu tuu"); 
		Test obj = new Test(); // obj created in any block  will be run
	}
	
	// static method
	static void tu() {
		System.out.println("tuu tuu"); // static block
		Test obj = new Test(); // obj created in any block  will be run
	}
	
	
	public static void main(String[] args) {
	
		Test obj = new Test();
		tu(); // static method will run in main method but not static block
	}

}
