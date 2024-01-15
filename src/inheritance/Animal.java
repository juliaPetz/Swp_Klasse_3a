package inheritance;

public class Animal {
	
	private String name;
	private String preferredFood;
	private int noOfLegs;
	private int age;
	
	public Animal() {}
		
	public Animal(String name, String preferredFood, int noOfLegs, int age) {
		this.name = name;
		this.preferredFood = preferredFood;
		this.noOfLegs = noOfLegs;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPreferredFood() {
		return preferredFood;
	}
	public void setPreferredFood(String preferredFood) {
		this.preferredFood = preferredFood;
	}
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return this.name + "\n\t isst am liebsten: " + this.preferredFood
				+ "\n\t hat so viele Beine: " + this.noOfLegs
				+ "\n\t ist so alt: " + this.age;
	}
	
	public void makeNoise() {
		System.out.println(this.name + " macht __________");
	}
	
}
