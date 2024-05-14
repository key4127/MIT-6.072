package NewLine;

public class NewLine {
	public static void main(String[] arguments) {
		System.out.println("Line 1");
		threeLines();
		System.out.println("Line 2");
	}
	
	public static void newLine() {	// the definition can be after the usage
		System.out.println("");
	}
	
	public static void threeLines() {
		newLine();
		newLine();
		newLine();
	}
}
