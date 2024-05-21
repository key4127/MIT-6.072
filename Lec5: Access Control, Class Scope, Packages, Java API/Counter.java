package Counter;  // review of Lec4

public class Counter {
	int myCounter = 0;
	static int ourCounter = 0;
	void increment() {
		myCounter++;
		ourCounter++;
	}
	
	public static void main(String[] arguments) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		counter1.increment();
		counter1.increment();
		counter2.increment();
		System.out.println("Counter 1: " + counter1.myCounter + " " + counter1.ourCounter); // Counter 1: 2 3
		System.out.println("Counter 2: " + counter2.myCounter + " " + counter2.ourCounter); // Counter 2: 1 3
	}
}
