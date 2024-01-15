package carRental;

public class Car {
	
	private String carBrand;
	private String driveType;
	private String classification;
	private boolean borrowed;
	private boolean reserved;
	private int lendingTime;
	private double price;
	
	
	public Car(String carBrand, String driveType, String classification, double price) {
		this.carBrand = carBrand;
		this.driveType = driveType;
		this.classification = classification;
		this.price = price;
		this.borrowed = false;
		this.reserved = false;
		this.lendingTime = 0;
	}
	
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getDriveType() {
		return driveType;
	}
	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public boolean isBorrowed() {
		return borrowed;
	}
	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}
	public boolean isReserved() {
		return reserved;
	}
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	public int getLendingTime() {
		return lendingTime;
	}
	public void setLendingTime(int lendingTime) {
		this.lendingTime = lendingTime;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Automarke: " + this.carBrand + "\n"
				+ "\t Klassifizierung: " + this.classification + "\n"
				+ "\t Preis: " + this.price;
	}
	
	/**
	 * Method calculates lending costs based
	 * on price and lending time.
	 * 
	 * @return calculated lending costs
	 */
	public double calculateLendingCosts() {
		return this.price * this.lendingTime;
	}
	
	/**
	 * Method borrows car, if car available.
	 * 
	 * @param lendingTime - time in days
	 * @return true, if car is available - false, if car is not available
	 */
	public boolean borrowCar(int lendingTime) {
		if(this.borrowed == false && this.reserved == false) {
			this.lendingTime = lendingTime;
			this.borrowed = true;
			System.out.println("Auto wurde erfolgreich entlehnt!");
			return true;
		} else if(this.borrowed == true) {
			System.out.println("Auto bereits entlehnt!");
			return false;
		} else {
			System.out.println("Auto ist bereits reserviert!");
			return false; 
		}
	}
	
	public boolean returnCar() {
		if(this.borrowed == true) {
			System.out.println("Erfolgreiche Rücknahme");
			System.out.println("Kosten: " + this.calculateLendingCosts());
			this.borrowed = false;
			this.lendingTime = 0;
			return true;
		} else {
			System.out.println("Auto ist nicht entlehnt!");
			return false;
		}
	}
	
	public boolean reserveCar() {
		if(this.reserved == false) {
			this.reserved = true;
			System.out.println("Auto wurde reserviert!");
			return true;
		} else {
			System.out.println("Auto ist bereits reserviert!");
			return false;
		}
	}
	
	
//	public boolean returnCar() {
//		System.out.println("Erfolgreiche Rücknahme");
//		System.out.println("Kosten: " + this.calculateLendingCosts());
//		this.borrowed = false;
//		this.lendingTime = 0;
//		return true;
//	}
	
	public boolean equals(Car car) {
		if(this.carBrand.equals(car.getCarBrand())
				&& this.driveType.equals(car.getDriveType())
				&& this.classification.equals(car.getClassification())) {
			return true;
		}
		return false; 
	}

}
