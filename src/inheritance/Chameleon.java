package inheritance;

public class Chameleon extends Animal {

	private String color;
	private double tongueLength;
	
	public Chameleon() {
		super();
	}
		
	public Chameleon(String name, String preferredFood, int noOfLegs, int age,
			String color, double tongueLength) {
		super(name, preferredFood, noOfLegs, age);
		this.color = color;
		this.tongueLength = tongueLength;
	}


	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getTongueLength() {
		return tongueLength;
	}
	public void setTongueLength(double tongueLength) {
		this.tongueLength = tongueLength;
	}
	
	public String toString() {
		return super.toString() + "\n\t hat die Farbe: " + this.color + 
				"\n\t Zungenlänge: " + this.tongueLength;
	} 
	
	public void makeNoise() {
		System.out.println(this.getName() + " macht ch ch ch!");
	}
	
}
