package Baby;

public class Baby {
	String name;
	boolean isMale;
	double weight = 5.0;
	int numPoops = 0;
	Baby[] siblings;
	static int numBabiesMade = 0;  // static means not unique for each instance
	
	Baby(String myname, boolean maleBaby) {
		name = myname;
		isMale = maleBaby;
		numBabiesMade++;
	}
	
	void sayHi() {
		System.out.println("Hi, my name is " + name);
	}
	
	void eat(double foodWeight) {
		if (foodWeight >= 0 && foodWeight < weight)
			weight = weight + foodWeight;
	}
	
	void doSomething(int x, int[] ys, Baby b) {
		x = 99;
		ys[0] = 99;
		b.name = "99";
	}
	
	static void cry(Baby thebaby) { // static methods cannot reference non-static methods
		System.out.println(thebaby.name + "cries");
	}
	
	public static void main(String[] arguments) {
		Baby shiloh = new Baby ("Shiloh Jolie-Pitt", true);
		shiloh.sayHi();
		shiloh.eat(1);
		System.out.println("");
		
		int i = 0; 
		int[] j = {0};
		Baby k = new Baby("50", true);
		k.doSomething(i, j, k);
		System.out.println(i + " " + j[0] + " " + k.name + "\n");	// 0 99 99
	}
}
