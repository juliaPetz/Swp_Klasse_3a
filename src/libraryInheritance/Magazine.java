package libraryInheritance;

public class Magazine extends Medium {
	
	private String author;
	
	public Magazine() {
		super();
	}
	
	public Magazine(String name, int year, String language, double price, Genre genre, String placement, int ageLimit,
			String publisher, int extent, String author) {
		super(name, year, language, price, genre, placement, ageLimit, publisher, extent);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return "Magazine: " + this.getName() + " - " + this.author + "(" + this.getYear() + ")";
	}

}
