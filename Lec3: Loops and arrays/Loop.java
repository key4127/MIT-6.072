package Loop;

public class Loop {
	public static void main(String[] arguments) {
		int i = 0;
		while (i < 3) {
			System.out.println("Rule #" + i);
			i = i + 1;
		}
		System.out.println("");
		
		for (i = 0; i < 3; i++) {
			System.out.println("Rule #" + i);
		}
		System.out.println("");
		
		for (i = 0; i < 3; i++) {
			if (i == 1)
				break;
			System.out.println("Rule #" + i);
		}
		System.out.println("");
		
		for (i = 0; i < 3; i++) {
			if (i == 1)
				continue;
			System.out.println("Rule #" + i);
		}
		System.out.println("");
		
		for (i = 0; i < 3; i++)
			for (int j = 2; j < 4; j++)
				System.out.println(i + " " + j);
	}
}
