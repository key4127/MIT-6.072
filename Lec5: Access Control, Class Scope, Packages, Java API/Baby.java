package parenttools;

public class Baby {
	int servings;
	public void feed(BabyFood servings) {
		this.servings = this.servings + servings.getServings();
	}
	public void poop() {
		System.out.println("All better");
		servings = 0;
	}
}
