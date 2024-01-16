package abstractEmployee;

public class Test {

	public static void main(String[] args) {
		
		Manager m = new Manager("John Doe", 1200);
		System.out.println(m);
		System.out.println(m.calculateBonus());
		
		Employee e = new Manager("Max Mustermann", 2300);
		System.out.println(e);
		System.out.println(e.calculateBonus());
		
		Developer d = new Developer("Harry Potter", 5000);
		System.out.println(d);
		System.out.println(d.calculateBonus());
		
		Employee e2 = new Developer("Ron Weasley", 3000);
		System.out.println(e2);
		System.out.println(e2.calculateBonus());

	}

}
