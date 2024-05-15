package Marathon;

public class Marathon {
	public static void findFastestRunner(String[] names, int[] times) { // If return the index, the codes will be much more simpler.
		int time = times[0];
		String name = names[0];
		for (int i = 0; i < names.length; i++)
			if (times[i] < time) {
				time = times[i];
				name = names[i];
			}
		System.out.println("The fastest runner is " + name + " .");
		System.out.println("His/Her time is " + time + " minutes.");
	}
	
	public static void findSecondFastestRunner(String[] names, int[] times) {
		int time = times[0], secondTime = times[1];
		String name = names[0], secondName = names[1];
		if (time > secondTime) {
			int tempTime = time;
			String tempName = name;
			time = secondTime;
			name = secondName;
			secondTime = tempTime;
			secondName = tempName;
		}
		for (int i = 2; i < names.length; i++) {
			if (times[i] < time) {
				time = times[i];
				name = names[i];
			} else if (times[i] < secondTime) {
				secondTime = times[i];
				secondName = names[i];
			}
		}
		System.out.println("The second fastest runner is " + secondName + " .");
		System.out.println("His/Her time is " + secondTime + " minutes.");
	}
	
	public static void main (String[] arguments) {
		 String[] names = {
			"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
			"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
			"Aaron", "Kate"
		};
		 
		int[] times = {
			341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
			343, 317, 265
		};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + times[i]);
		}
		
		findFastestRunner(names, times);
		findSecondFastestRunner(names, times);
	}
}
