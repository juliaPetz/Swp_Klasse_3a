package inheritance;

public class Cat extends Animal{
	
	private String color;
	
	public Cat() {
		super();
	}

	public Cat(String name, String preferredFood, int noOfLegs, int age, String color) {
		super(name, preferredFood, noOfLegs, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return super.toString() + "\n\t hat die Farbe: " + this.color;
	}
	
	public void makeNoise() {
		System.out.println(this.getName() + " macht miau!");
	}

}
