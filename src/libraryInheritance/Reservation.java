package libraryInheritance;

public class Reservation {
	
	private Customer customer;
	private Medium medium;
	private boolean status;
	
	public Reservation() {}
	
	public Reservation(Customer customer, Medium medium) {
		this.customer = customer;
		this.medium = medium;
		this.status = true;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Medium getMedium() {
		return medium;
	}
	public void setMedium(Medium medium) {
		this.medium = medium;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String toString() {
		return "Reservation: \n\t Customer: " + this.customer + "\n\t Media: " + this.medium + "\n\t Status: " + this.status; 
	}
}
