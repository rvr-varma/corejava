package com.javaintro;

public class Welcome {

	int a =10;// instance variables
	String b; // instance variables
	
	static int raj; // static variables
	static String sai; // static variables
	

	public static void main(String[] args) {

		Welcome obj = new Welcome();
		
		sai = "hi"; //  static Initialization
		
	System.out.println(obj.a);
     System.out.println(raj);  // accessing
     System.out.println(sai);
     
	}

}
