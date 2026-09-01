package com.javaintro;

public class Raja {

	public static void main(String[] args) throws ClassNotFoundException {
           
		System.out.println("main method started");
		
		Class.forName("java.lang.System");  //bootstarp class loader
		Class.forName("java.lang.String");  //bootstarp class loader
		
		Class.forName("com.javaintro.Welcome"); //Application class loader
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //jdbc connection
		
		System.out.println("main method ended");
		
	}

}
