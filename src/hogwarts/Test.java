package hogwarts;

import java.time.LocalDate;


public class Test {

	public static void main(String[] args) {
		Address a1 = new Address("Private Drive", 4, 5678, "Little Whining", "UK");
		System.out.println(a1);
		Parent p1 = new Parent("Lilli", "Potter", a1, Gender.FEMALE);
		System.out.println(p1);
		Student s1 = new Student("Harry", "Potter", LocalDate.of(1980, 7, 31), a1, Gender.MALE);
		s1.addParent(p1);
		System.out.println(s1);
		Teacher t1 = new Teacher("Severus", "Snape", LocalDate.of(1960, 1, 9),
				new Address("Spinner's End", 3, 6799, "Clockworth", "UK"), 
				Gender.MALE, 767);
		t1.addSubject("Potions");
		t1.addSubject("Defence against Dark Arts");
		System.out.println(t1);
		House slytherin = new House("Slytherin", "******", 0, t1);
		System.out.println(slytherin);
		slytherin.addStudent(s1);
		slytherin.printAllStudents();
	}

}
