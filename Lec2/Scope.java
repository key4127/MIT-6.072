package Scope;

public class Scope {
	public static void main(String[] arguments) {
		int x = 5;
		if (x == 5) {
			int x = 6;	// Duplicate local variable x
			int y = 72;
			System.out.println("x = " + x + " y = " + y);
		}
		System.out.println("x = " + x + " y = " + y);	// y cannot be resolved to variable
	}
}
