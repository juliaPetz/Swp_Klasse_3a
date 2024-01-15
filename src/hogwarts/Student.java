package hogwarts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Student {

	private UUID id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Address address;
	private ArrayList<Parent> parents;
	private Gender gender;
	
	public Student(String firstName, String lastName, LocalDate birthDate, Address address, Gender gender) {
		this.id = UUID.randomUUID();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.address = address;
		this.gender = gender;
		this.parents = new ArrayList<Parent>();
	}
	
	public UUID getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ArrayList<Parent> getParents() {
		return parents;
	}
	public void setParents(ArrayList<Parent> parents) {
		this.parents = parents;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		String tmp = "Student: " + firstName + " " + lastName + "\n\t " 
				+ birthDate + "\n\t " 
				+ address + "\n\t " + gender + "\n";
		for(Parent p : this.parents) {
			tmp = tmp + "\t " + p + "\n";
		}
		return tmp;
	} 
	
	public void addParent(Parent parent) {
		if(!this.parents.contains(parent)) {
			this.parents.add(parent);
		}
	}
	
	public void removeParent(Parent parent) {
		this.parents.remove(parent);
	}
	
	
	
	
}
