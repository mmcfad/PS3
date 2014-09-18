package mainPackage;

import java.util.Date;

public class Account {

	private int id = 0; // Assign default value
	private static double balance = 0; // Assign default value
	private static double annualInterestRate = 0; // Assign default value
	private static Date dateCreated;
	public Account(){
	}
	
// Constructor with id and balance args
	public Account(int newID, double updateBalance, double interestRate)
	{
	dateCreated = new Date();
	id = newID;
	balance = updateBalance;
	annualInterestRate = interestRate;
	}

// Accessor method for id
	public int getID()
	{
	return id;
	}

	
// Mutator method for id
	public void setID(int newID)
	{
	id = newID;
	}

// Accessor method for balance
	public static double getBalance()
	{
	return balance;
	}
	
// Mutator method for balance
	public static void setBalance(double updateBalance)
	{
	balance = updateBalance;
	}

// Accessor method for annualInterestRate
	public static double getAnnualInterestRate()
	{
	return annualInterestRate;
	}

	
// Mutator method for annualInterestRate
	public static void setAnnualInterestRate(double newAnnualInterestRate)
	{
	annualInterestRate = newAnnualInterestRate;
	}
	
// Accessor method for dateCreated;
	public static Date getDateCreated()
	{
	return dateCreated;
	}
	
// Method that returns the monthlyInterestRate
	public static double getMonthlyInterestRate()
	{
	return annualInterestRate/12;
	}
	
// Method that withdraws a specified amount from the account.
	public static void withdraw(double withdrawAmount) throws InsufficientFunds
	{
		if(balance >= withdrawAmount){
			balance -= withdrawAmount;
		}
		else {
			double needs = withdrawAmount - balance;
			throw new InsufficientFunds(needs);
			}
	}

// Method that deposits a specified amount into the account.
	public static void deposit(double depositAmount) 
	{
	balance += depositAmount;
	}
	
	
}

	

	


