package Malicious;

import CreditCard.CreditCard;

public class Malicious {
	public static void main(String[] arguments) {
		maliciousMethod(new CreditCard());
	}
	
	static void maliciousMethod(CreditCard card) {
		//card.expenses = 0;
		//System.out.println(card.cardNumber);
		// After the access control done, the private variables are invisible.
	}
}
