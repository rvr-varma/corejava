package com.javaintro;

public class Student {
	static String collegeName;
	 

	
	String studentName ;
	int studentId;
	int studentMarks;
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj= new Student();
		
		collegeName = "vcube";
		
		obj.studentName = "raja";
		obj.studentId =45;
		obj.studentMarks = 85;
				
		System.out.println("college name :"+collegeName );
		System.out.println("st name :"+obj.studentName );
		System.out.println("st ID :"+obj.studentId);
		System.out.println("st MARKS :"+obj.studentMarks);

		
		
		
		
	}

}
