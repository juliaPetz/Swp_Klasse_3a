package carRental;

public class Test {

	public static void main(String[] args) {
		
		Car car = new Car("BMW", "Elektro", "Familienauto", 50);
		Car car1 = car;
		Car car2 = new Car("Kia", "Benzin", "Kleinwagen", 30);
//		System.out.println(car);
//		car.borrowCar(10);
//		car.borrowCar(5);
//		System.out.println(car.calculateLendingCosts());
		CarRental cr = new CarRental();
		cr.addCar(car);
		cr.addCar(car);
		cr.addCar(car);
		cr.addCar(car1);
		car.setCarBrand("Fiat");
		car1.setCarBrand("Ferrari");
//		cr.removeCar(car);
		cr.printCarList();
		System.out.println(car.equals(car1));
		System.out.println(car.equals(car2));

	}

}
