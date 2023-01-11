package com.edu.com;

class client{
	public static void main(String args[])
	{
	    //Creating object
		BankFactory b =new MMBankFactory();
		SavingAcc s= new MMSavingAcc(85639456,"Pooja Patil", 30000, true);
		CurrentAcc c = new MMCurrentAcc(856936547,"Prajoo", 30000,10000);
		//Printing Statement
		System.out.println("Saving Account");
		//Calling Method by Using Object
		s.withdraw(s.getAccBal());
		
		System.out.println();
		//Printing Statement
		System.out.println("Current Account");
		//Calling Method by Using Object
		c.withdraw(c.getAccBal());
		
		System.out.println();
		//Printing Object s
	    System.out.println(s);
	  //Printing Object c
	    System.out.println(c);
	    
	   
	}  
} 
