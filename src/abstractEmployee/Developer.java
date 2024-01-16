package abstractEmployee;

public class Developer extends Employee {
	
	public Developer(String name, double salary) {
		super(name, salary);
	}

	@Override
	public double calculateBonus() {
		return this.getSalary() * 0.5;
	}

}
