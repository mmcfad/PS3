package mainPackage;

import java.text.*;

public class testAccount {
	
	public static void main (String[] args) throws InsufficientFunds {
		DecimalFormat fmt_twoDecimalPlaces = new DecimalFormat("0.00");
		
		
		new Account(1122, 20000, 4.5);
		
		
		Account.withdraw(2500);

		Account.deposit(3000);

//		Account.withdraw(25000);           Can't get insufficient funds error to work properly
		
		System.out.println("Balance is " +
				fmt_twoDecimalPlaces.format(Account.getBalance()));
		
		System.out.println("Monthly interest is " +
				fmt_twoDecimalPlaces.format( Account.getMonthlyInterestRate() ));

		System.out.println("This account was created at " +
				Account.getDateCreated());

		}
	
	
}
