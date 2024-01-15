package hogwarts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Teacher {

	private UUID id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Address address;
	private Gender gender;
	private int numberByGringotts;
	private ArrayList<String> subjects;
	
	public Teacher(String firstName, String lastName, LocalDate birthDate, Address address, Gender gender,
			int numberByGringotts) {
		this.id = UUID.randomUUID();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.address = address;
		this.gender = gender;
		this.numberByGringotts = numberByGringotts;
		this.subjects = new ArrayList<String>();
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getNumberByGringotts() {
		return numberByGringotts;
	}
	public void setNumberByGringotts(int numberByGringotts) {
		this.numberByGringotts = numberByGringotts;
	}
	public ArrayList<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(ArrayList<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		String tmp = "Teacher: " + firstName + " " + lastName + "\n\t " + birthDate
				+ "\n\t " + address + "\n\t " + gender + "\n\t Gringotts: " + numberByGringotts
				+ "\n\t Subjects: ";
		for(String s : subjects) {
			tmp = tmp + s + " ";
		}
		return tmp;
	}
	
	public void addSubject(String subject) {
		if(!this.subjects.contains(subject)) {
			this.subjects.add(subject);
		}
	}
	
	public void removeSubject(String subject) {
		this.subjects.remove(subject);
	}
	
	
}
