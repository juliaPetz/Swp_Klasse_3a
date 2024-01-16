package abstractEmployee;

public class Manager extends Employee {
	
	public Manager(String name, double salary) {
		super(name, salary);
	}

	@Override
	public double calculateBonus() {
		return this.getSalary() * 0.25;
	}

}
