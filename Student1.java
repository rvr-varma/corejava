package com.javaintro;

public class Student1 {
static String college = "Bharath";
String name;
int age;

void display() {
	System.out.println("Name of the Student : "+name);
	System.out.println("Age : " +age);
	System.out.println("college name : "+college);
};
	public static void main(String[] args) {

		Student1  t = new Student1();
		
		t.name = "Raja";
		t.age = 21;
		t.display();
		
		
		Student1  t1 = new Student1();
		
		t1.name = "sai";
		t1.age = 19;
		t1.display();
		
	}

}
