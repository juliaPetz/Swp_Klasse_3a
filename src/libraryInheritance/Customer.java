package libraryInheritance;

import java.time.LocalDate;
import java.util.UUID;

public class Customer {
	
	private UUID id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private boolean isActive;
	
	
	public Customer(String firstName, String lastName, LocalDate birthDate) {
		this.id = UUID.randomUUID();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.isActive = true;
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
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public UUID getId() {
		return id;
	}
	
	
	public String toString() {
		return this.firstName + " " + this.lastName + " | " + this.birthDate;
	}
	

}
