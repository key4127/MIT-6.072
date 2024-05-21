package SetExample;
import java.util.TreeSet; // automatically sorted

public class SetExample {
	public static void main(String[] arguments) {
		TreeSet<String> strings = new TreeSet<String>(); // red-black tree in fact
		strings.add("Evan");
		strings.add("Eugene");
		strings.add("Adam");
		
		System.out.println(strings.size());  // 3
		System.out.println(strings.first()); // Adam
		System.out.println(strings.last());  // Evan
		
		strings.remove("Eugene");
		
		for(String s : strings)
			System.out.println(s); // Adam Evan
	}
}
