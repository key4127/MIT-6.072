package FooCorporation;

public class FooCorporation {
	public static void calculator(int hour, double pay) {
		if (hour > 60) {
			System.out.println("Error: the number of hours is greater than 60.");
			return;
		}
		if (pay < 8.00) {
			System.out.println("Error: the base pay is less than the minimum wage.");
			return;
		}
		if (hour <= 40) 
			System.out.println("The total pay is " + hour * pay + "$.");
		else
			System.out.println("The total pay is " + (40.0 * pay + (hour - 40.0) * pay * 1.5) + "$.");	// The second parentheses cannot be omitted.
	}		// Although hour's type is integer, it gives the correct answer.
	
	public static void main(String[] arguments) {
		calculator(35, 7.50);
		calculator(47, 8.20);
		calculator(73, 10.00);
	}
}
