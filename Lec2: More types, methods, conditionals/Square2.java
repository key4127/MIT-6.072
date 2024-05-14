package Square2;

public class Square2 {
	public static void printSquare(int x) {
		System.out.println(x * x);
	}
	
	public static void main(String[] arguments) {
		printSquare(5.5);
		//Error: The method printSquare(int) in the type Square2 is not applicable for the arguments (double)
	}
}
