package libraryInheritance;

import java.util.UUID;

public class Medium {
	
	private UUID id;
	private String name;
	private int year;
	private String language;
	private double price;
	private Genre genre;
	private String placement;
	private int ageLimit;
	private String publisher;
	private int extent;
	
	public Medium() {}
	
	
	
	public Medium(String name, int year, String language, double price, Genre genre, String placement, int ageLimit,
			String publisher, int extent) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.year = year;
		this.language = language;
		this.price = price;
		this.genre = genre;
		this.placement = placement;
		this.ageLimit = ageLimit;
		this.publisher = publisher;
		this.extent = extent;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String getPlacement() {
		return placement;
	}
	public void setPlacement(String placement) {
		this.placement = placement;
	}
	public int getAgeLimit() {
		return ageLimit;
	}
	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getExtent() {
		return extent;
	}
	public void setExtent(int extent) {
		this.extent = extent;
	}
	public UUID getId() {
		return id;
	}
	
	
	public String toString() {
		return this.name + " " + this.year + " " + this.genre;
	}
	
	
	

}
