
public class CreditCard {
	//instance variables are different for every object of class
	private String name;
	private double balance;
	
	//static variables are the same for all objects of a class
	private static double creditLimit = 500.00;
	
	//constructor
	public CreditCard(String newName) {
		name = newName;
		balance = 0.00;
	}
	
	//non-static methods
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	//if the priceOfTheItem is greater than or equal to 0 and if the balance plus
	//the priceOfTheItem is less than or equal to the creditLimit then change the balance
	//by adding the priceOfTheItem to the balance and returning true
	//otherwise return false without changing the balance
	public boolean charge(double priceOfTheItem) {
		if(priceOfTheItem >= 0 && priceOfTheItem + balance <= creditLimit) {
			balance = priceOfTheItem + balance;
			return true;
		}
		else {
			return false;
		}
	}
	
	//if the the amount is greater than or equal to 0 and if the amount is less than
	//or equal to the balance then subtract amount from balance and return true
	//otherwise return false without changing the balance
	public boolean pay(double amount) {
		if(amount >= 0 && amount <= balance) {
			balance = balance - amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	//static methods can only access static variables and should be called only
	//on the class itself and not on objects of the class
	public static void increaseCreditLimit(double newCreditLimit) {
		if(newCreditLimit > creditLimit) {
			creditLimit = newCreditLimit;
		}
	}
	
	public static double getCreditLimit() {
		return creditLimit;
	}
	
}

