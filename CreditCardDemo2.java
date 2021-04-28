import java.util.Scanner;
public class CreditCardDemo2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		CreditCard myCard = new CreditCard("");
		int option;
		
		do {
			System.out.println("Press 1 to change the name on the card.");
			System.out.println("Press 2 to charge something to the credit card.");
			System.out.println("Press 3 to make a payment to the credit card.");
			System.out.println("Press 4 to check the balance on the credit card.");
			System.out.println("Press 5 to look at the credit limit.");
			System.out.println("Press 6 to end the program.");
			option = keyboard.nextInt();
			keyboard.nextLine();//go to next line
			
			if(option == 1) {
				System.out.println("Whats the name on the card?");
				String newName = keyboard.nextLine();
				myCard.setName(newName);
			}
			else if(option == 2) {
				System.out.println("Enter the price of the item you are trying to purchase.");
				double price = keyboard.nextDouble();
				boolean successful = myCard.charge(price);
				if(successful == true) {
					System.out.println("The charge was approved.");
				}
				else {
					System.out.println("The charge was rejected.");
				}
			}
			else if(option == 3) {
				System.out.println("Enter the amount you want to pay.");
				double amount = keyboard.nextDouble();
				boolean paid = myCard.pay(amount);
				if(paid == true) {
					System.out.println("Your payment was accepted.");
				}
				else {
					System.out.println("Your payment was rejected.");
				}
			}
			else if(option == 4) {
				System.out.println("Balance: $ " + myCard.getBalance());
			}
			else if(option == 5) {
				System.out.println("Credit Limit: $ " + CreditCard.getCreditLimit());
			}
			else if(option == 6) {
				System.out.println("Goodbye! Thank you for using our program!");
			}
			else {
				System.out.println("Error! Invalid option! Try again!");
			}
		}while(option != 6);
	}
}
