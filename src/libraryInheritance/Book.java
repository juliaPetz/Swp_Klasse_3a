package libraryInheritance;

public class Book extends Medium{

	private String author;
	private long isbn;
	
	public Book() {
		super();
	}
	
	public Book(String name, int year, String language, double price, Genre genre, String placement, int ageLimit,
			String publisher, int extent, String author, long isbn) {
		super(name, year, language, price, genre, placement, ageLimit, publisher, extent);
		this.author = author;
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
	public String toString() {
		return "Book: " + this.getName() + " - " + this.author + "(" + this.getYear() + ")";
	}
}
