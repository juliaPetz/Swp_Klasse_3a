package libraryInheritance;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Medium> media;
	private ArrayList<Customer> customers;
	private ArrayList<Rental> rentals;
	private ArrayList<Reservation> reservations;
	
	
	public Library() {
		this.media = new ArrayList<>();
		this.customers = new ArrayList<>();
		this.rentals = new ArrayList<>();
		this.reservations = new ArrayList<>();
	}
	
	public ArrayList<Medium> getMedia() {
		return media;
	}
	public void setMedia(ArrayList<Medium> media) {
		this.media = media;
	}
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	public ArrayList<Rental> getRentals() {
		return rentals;
	}
	public void setRentals(ArrayList<Rental> rentals) {
		this.rentals = rentals;
	}
	public ArrayList<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	public void addMedium(Medium medium) {
		if(!this.media.contains(medium)) {
			this.media.add(medium);
		}
	}
	
	public void removeMedium(Medium medium) {
		this.media.remove(medium);
	}
	
	public void addCustomer(Customer customer) {
		if(!this.customers.contains(customer)) {
			this.customers.add(customer);
		}
	}

	public void removeCustomer(Customer customer) {
		if(this.customers.contains(customer)) {
			customer.setActive(false);
		}
	}
}
