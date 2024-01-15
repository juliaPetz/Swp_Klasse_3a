package libraryInheritance;

import java.time.LocalDate;

public class Rental {
	
	private Customer customer;
	private Medium medium;
	private LocalDate startDate;
	private LocalDate endDate;
	private boolean status;
	
	public Rental(Customer user, Medium medium, LocalDate startDate) {
		this.customer = user;
		this.medium = medium;
		this.startDate = startDate;
		this.endDate = this.startDate.plusWeeks(5);
		this.status = true;
	}
	public Customer getUser() {
		return customer;
	}
	public void setUser(Customer customer) {
		this.customer = customer;
	}
	public Medium getMedia() {
		return medium;
	}
	public void setMedia(Medium medium) {
		this.medium = medium;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public boolean isBorrowed() {
		return status;
	}
	public void setBorrowed(boolean isBorrowed) {
		this.status = isBorrowed;
	}
	
	public String toString() {
		return "Rental: \n\t Customer: " + this.customer + "\n\t Medium: " + this.medium + "\n\t | " + this.startDate + "-  " + this.endDate; 
	}
	

}
