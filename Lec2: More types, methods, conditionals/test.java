package test;

public class test {
	public static void testIf(int x) {
		if (x > 5) {
			System.out.println(x + " is > 5"); // If there is only one statement, the block can be omitted.
		}
	}
	
	public static void testElse(int x) {
		if (x > 5) {
			System.out.println(x + " is > 5");
		} else {
			System.out.println(x + " is not > 5");
		}
	}
	
	public static void testElseIf(int x) {
		if (x > 5) {
			System.out.println(x + " is > 5");
		} else if (x == 5) {
			System.out.println(x + " equals 5");
		} else if (x < 5) {
			System.out.println(x + " is < 5");
		}
	}
	
	public static void main(String[] arguments) {
		testIf(6);
		testIf(5);
		testIf(4);
		System.out.println("");
		testElse(6);
		testElse(5);
		testElse(4);
		System.out.println("");
		testElseIf(6);
		testElseIf(5);
		testElseIf(4);
	}
}
