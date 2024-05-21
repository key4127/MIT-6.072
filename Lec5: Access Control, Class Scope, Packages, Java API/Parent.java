package adult;

import parenttools.Baby;
import parenttools.BabyFood;

public class Parent {
	public static void main(String[] arguments) {
		Baby baby = new Baby();
		baby.feed(new BabyFood());
	}
}
