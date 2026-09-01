package com.javaintro;

public class Test1 {
int id= 101;
	
	public static void main (String[] args) {
		
		Test1 obj = new Test1();
		Test1 obj1 = new Test1();
		
		int id2 = obj.id;
		System.out.println(id2);
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}
}
