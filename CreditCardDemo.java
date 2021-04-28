            
public class CreditCardDemo {
	public static void main (String [] args) {
		System.out.println(CreditCard.getCreditLimit());
		CreditCard.increaseCreditLimit(1000.00);
		System.out.println(CreditCard.getCreditLimit());
		
		CreditCard myCard = new CreditCard("Joshua Castillo");
		boolean successful = myCard.charge(250.00);
		System.out.println(successful);
		successful = myCard.charge(900.00);
		System.out.println(successful);
		
		boolean paid = myCard.pay(300.00);
		System.out.println(paid);
		
	}

}
