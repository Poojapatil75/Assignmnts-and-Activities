package com.edu.com;

//main Abstract Class
public abstract class BankApplication {
//Private access Datatypes to Enhance Encapsulation 	
	private int accNo;
	private String accNm;
	private float accBal;
//Parameterized Constructor
	public BankApplication(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	//Abstract Methods with parameter
	abstract public void withdraw(float accBal);
	//Deposite methods for abstract method
	public void deposite (float accBal)
	{
		System.out.println(accBal);
	}
	//Getter And Setter Method
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}

}
//Abstract class using inheritance 
abstract class CurrentAcc extends BankApplication {
//Final Keyword variable value cannot be changed
	final private float creditLimit;
	
	public CurrentAcc(int accNo,String accNm,float accBal,float creditLimit)
	{   //super keyword
		super(accNo,accNm,accBal);
		//this keyword
		this.creditLimit = creditLimit;
	}
	@Override
	//withdraw method using parameter
	public void withdraw(float accBal)
	{
		System.out.println("Account no.is: "+this.getAccNo()+" "+
				"Account name is: "+this.getAccNm()+" "+
				"Balance is: "+this.getAccBal());
	}
	@Override
	//tostring methods
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
}

abstract class SavingAcc extends BankApplication {
	//Logic Operator used
	private boolean isSalaried;
	//final keyword 
	static final private float MINBAL=0.0f;
	//Parameterized Constructor
	public SavingAcc(int accNo,String accNm,float accBal,boolean isSalaried) 
	{
		super(accNo,accNm,accBal);
		this.isSalaried = isSalaried;
	}
	
	@Override
	//withdraw method with Arguments
	public void withdraw(float accBal)
	{
		System.out.println("Account no.is: "+this.getAccNo()+" "+
				"Account name is: "+this.getAccNm()+" "+
				"Balance is: "+this.getAccBal());
	}

	@Override
	//to String Method Used
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	

}


//Abstract Class with Abstract methods
abstract class BankFactory {
	abstract public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried);
	abstract public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal,float creditLimited);
}
//inheritance of Saving Class
class MMSavingAcc extends SavingAcc {
		static final float MINBAL=00.0f;


     //Withdraw Method with Argument
		@Override
		public void withdraw(float accBal) {
			{
				System.out.println("Account no.is: "+this.getAccNo()+" "+
						"Account name is: "+this.getAccNm()+" "+
						"Balance is: "+this.getAccBal());
			}
			//Conditional Statements
			if(accBal>=10000.00f)
			{
				System.out.println("You can withdraw Money");
			}
			else 
			{
				System.out.println("You can not withdraw Money");
			}
			
			System.out.println(accBal);
		}


//Constructor 
		public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
			super(accNo, accNm, accBal, isSalaried);
			
			
			
		}



//to String method
		@Override
		public String toString() {
			return "MMSavingAcc [toString()=" + super.toString() + "]";
		}

}
//Inheritance using CurrentAcc Class
class MMCurrentAcc extends CurrentAcc {
//Constructor Parameterized
		public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
			super(accNo, accNm, accBal, creditLimit);
			// TODO Auto-generated constructor stub
		}

		@Override
		//Withdraw Method with Argument
		public void withdraw(float accBal) {
			
			{
				System.out.println("Account no.is: "+this.getAccNo()+" "+
						"Account name is: "+this.getAccNm()+" "+
						"Balance is: "+this.getAccBal());
			}
//Conditional Statements
			if(accBal>=10000.00f)
			{
				System.out.println("You can withdraw Money");
			}
			else 
			{
				System.out.println("You can not withdraw Money");
			}
			System.out.println(accBal);
			
		}
//ToString Method
		@Override
		public String toString() {
			return "MMCurrentAcc [toString()=" + super.toString() + "]";
		}
		

	}
//Inheritance
class MMBankFactory extends BankFactory {
//Polymorphism 
		@Override
		public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
			MMSavingAcc s=new MMSavingAcc(accNo,accNm,accBal,isSalaried);
			return s;
		}

		@Override
		public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimited) {
			MMCurrentAcc c=new MMCurrentAcc(accNo,accNm,accBal,creditLimited);
			return c;
		}

	}


