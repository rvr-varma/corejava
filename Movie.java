package com.javaintro;

public class Movie {

	static String theaterName;
	static String  theaterLocation;
	
	String movieName;
	String movieBudget;
	String releaseDate;
	

  void display() {
		
		System.out.println("*****______THEATER DETAILS______*****");
		System.out.println("Theater name  :"+ theaterName);
		System.out.println("Theater Location :"+ theaterLocation);
		System.out.println(" ");
		System.out.println("*****______Movie DETAILS______*****");
		System.out.println("MOVIE NAME : " + movieName);
		System.out.println("MOVIE BUDGET : " + movieBudget);
		System.out.println("RELEASE DATE : "+ releaseDate);
		System.out.println(" ");
	};

	public static void main(String[] args) {  
		theaterName = "arjun70mm";
		theaterLocation = "JNTU";
	
 Movie obj = new Movie();
		
		obj.movieName ="IRUMUDI"; 
		obj.movieBudget = "50 cr";
		obj.releaseDate = "14/aug/2026";
		
Movie obj1 = new Movie();
		
		obj1.movieName ="vas"; 
		obj1.movieBudget = "70 cr";
		obj1.releaseDate = "10/aug/2026";

	 obj.display();
	 obj1.display();
		
	}

}
