package Array;

public class Array {
	public static void main(String[] arguments) {
		int[] values = new int[5];	// different from C++ 
		//int[] values = {v1, v2, ..., vn} also permitted
		
		for (int i = 0; i < values.length; i++) {	// do not need parentheses
			values[i] = i;
			int y = values[i] * values[i];
			System.out.println(y);
		}
		System.out.println("");
		
		int i = 0;
		while (i < values.length) {
			values[i] = i;
			int y = values[i] * values[i];
			System.out.println(y);
			i++;
		}
	}
}
