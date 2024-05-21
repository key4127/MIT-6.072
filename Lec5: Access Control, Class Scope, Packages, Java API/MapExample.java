package MapExample;
import java.util.HashMap; // unordered
import java.util.Map;

public class MapExample {
	public static void main(String[] arguments) {
		HashMap<String, String> strings = new HashMap<String, String>(); // key value
		strings.put("Evan", "email1@mit.edu");
		strings.put("Eugene", "email2@mit.edu");
		strings.put("Adam", "email3@mit.edu");
		
		System.out.println(strings.size()); // 3
		strings.remove("Evan");
		System.out.println(strings.get("Evan")); // null
												 // looking up the values and getting back keys is also permitted, but is more complicated.
		for (String s : strings.keySet())
			System.out.println(s);
		for (String s : strings.values())
			System.out.println(s);
		for (Map.Entry<String, String> pairs : strings.entrySet()) // Adam=email3@mit.edu
			System.out.println(pairs);							   // Map.Entry is an interface
	}
}