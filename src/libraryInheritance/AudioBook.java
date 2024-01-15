package libraryInheritance;

public class AudioBook extends Medium{

	private String format;
	private String author;
	
	public AudioBook() {
		super();
	}
	
	
	public AudioBook(String name, int year, String language, double price, Genre genre, String placement, int ageLimit,
			String publisher, int extent, String format, String author) {
		super(name, year, language, price, genre, placement, ageLimit, publisher, extent);
		this.format = format;
		this.author = author;
	}



	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return "AudioBook: " + this.getName() + " - " + this.author + "(" + this.getYear() + ")";
	}
	
}
