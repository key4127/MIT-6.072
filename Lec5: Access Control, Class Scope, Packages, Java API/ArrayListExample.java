package ArrayListExample;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] arguments) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Evan");
		strings.add("Eugene");
		strings.add("Adam");
		
		System.out.println(strings.size());	// 3
		System.out.println(strings.get(0)); // Evan
		System.out.println(strings.get(1)); // Eugene
		
		strings.set(0, "Goodbye");
		strings.remove(1);
		for (int i = 0; i < strings.size(); i++) // Goodbye
			System.out.println(strings.get(i));  // Adam
		for (String s : strings) {
			System.out.println(s);
		}
	}
}
