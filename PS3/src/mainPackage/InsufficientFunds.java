package mainPackage;
	
	public class InsufficientFunds extends Exception
	{

	private double amount;

//Getter
	   public double getAmount(){
	      return amount;
	   }
//Setter
	   public double setAmount(double amount){
		   return amount;
	   }
//Creating an instance of InsufficientFunds to be thrown to the caller
	   
	   public InsufficientFunds(double amount){
	      this.amount = amount;
	   } 

	}


