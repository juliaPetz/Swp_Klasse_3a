package inheritance;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("Nico", "Meat", 4, 12);
		Cat c1 = new Cat("Lilli", "Milk", 4, 3, "White");
		Animal a2 = new Cat("Nils", "Milk", 4, 1, "Black");
		Dog d1 = new Dog("Bob", "Beef", 4, 2, true);
		Chameleon ch1 = new Chameleon("Pascal", "Insects", 4, 4, "Green", 24.5);
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(a1);
		animals.add(c1);
		animals.add(a2);
		animals.add(d1);
		animals.add(ch1);
		
		for(Animal a : animals) {
			//System.out.println(a);
			a.makeNoise();
		}

	}

}
