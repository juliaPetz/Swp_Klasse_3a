package carRental;

import java.util.ArrayList;

public class CarRental {

	private ArrayList<Car> carList;
	
	public CarRental() {
		this.carList = new ArrayList<Car>();
	}

	public ArrayList<Car> getCarList() {
		return carList;
	}

	public void setCarList(ArrayList<Car> carList) {
		this.carList = carList;
	}
	
	/**
	 * Method adds car to list of car rental
	 * 
	 * @param car - car, to be added
	 */
	public void addCar(Car car) {
		this.carList.add(car);
	}
	
	public void removeCar(Car car) {
		this.carList.remove(car);
	}
	
	public void printCarList() {
		for(Car car : this.carList) {
			System.out.println(car);
		}
	}
	
	public void printAvailableCars() {
		for(Car c : this.carList) {
			// c.isBorrowed() == false
			if(!c.isBorrowed() && !c.isReserved()) {
				System.out.println(c);
			}
		}
	}
	
	public ArrayList<Car> getCarsWithClassification(String classification){
		ArrayList<Car> tmp = new ArrayList<Car>();
		for(Car c : this.carList) {
			if(c.getClassification().equals(classification)) {
				tmp.add(c);
			}
		}
		return tmp;
	}
	
	public double calculateTotalRevenue() {
		double sumTotal = 0;
		for(Car c : this.carList) {
			sumTotal = sumTotal + c.calculateLendingCosts();
		}
		return sumTotal;
	}
}
