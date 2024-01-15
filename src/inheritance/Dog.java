package inheritance;

public class Dog extends Animal {
	
	private boolean performTricks;
	
	public Dog() {
		super();
	}

	public Dog(String name, String preferredFood, int noOfLegs, int age,
			boolean performTricks) {
		super(name, preferredFood, noOfLegs, age);
		this.performTricks = performTricks;
	}



	public boolean isPerformTricks() {
		return performTricks;
	}

	public void setPerformTricks(boolean performTricks) {
		this.performTricks = performTricks;
	}
	
	public String toString() {
		return super.toString() + "\n\t kann Tricks: " + this.performTricks;
	}
	
	public void makeNoise() {
		System.out.println(this.getName() + " macht wau wau!");
	}

}
