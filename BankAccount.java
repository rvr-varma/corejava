package com.javaintro;

public class BankAccount {
 int Accno ;
 String accHolderName;
 double balance;
 static int accountNoGenerater =9260400;
  
 {
	 System.out.println("    **** BANK ACCOUNT DETAILS ****    ");
   
	accountNoGenerater++;
	  Accno = accountNoGenerater;
	 
	};
 
	public static void main(String[] args) {	

	BankAccount t= new BankAccount();
	
	t.accHolderName = "Raja";
	t.balance = 5000;
	
	System.out.println("Acc No :"+t.Accno );
	System.out.println("Acc Holder Name :"+t.accHolderName);
	System.out.println("Balance :" + t.balance);
	
	
	BankAccount t1= new BankAccount();

	t1.accHolderName = "Sai";
	t1.balance = 22500.21;
	
	System.out.println("Acc No :"+t1.Accno);
	System.out.println("Acc Holder Name :"+t1.accHolderName);
	System.out.println("Balance :" + t1.balance);

	
	BankAccount t2= new BankAccount();
	
	t2.accHolderName = "Ravi";
	t2.balance = 80000;
	
	System.out.println("Acc No :"+t2.Accno);
	System.out.println("Acc Holder Name :"+t2.accHolderName);
	System.out.println("Balance :" + t2.balance);
	

	BankAccount t3= new BankAccount();
	
	t3.accHolderName = "Varma";
	t3.balance = 5070.98;
	
	System.out.println("Acc No :"+t3.Accno);
	System.out.println("Acc Holder Name :"+t3.accHolderName);
	System.out.println("Balance :" + t3.balance);
		
	}

}
