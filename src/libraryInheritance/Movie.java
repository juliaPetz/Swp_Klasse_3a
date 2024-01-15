package libraryInheritance;

public class Movie extends Medium{

	private String quality;
	private boolean subtitles;
	
	public Movie() {
		super();
	}
	
	public Movie(String name, int year, String language, double price, Genre genre, String placement, int ageLimit,
			String publisher, int extent, String quality, boolean subtitles) {
		super(name, year, language, price, genre, placement, ageLimit, publisher, extent);
		this.quality = quality;
		this.subtitles = subtitles;
	}



	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public boolean isSubtitles() {
		return subtitles;
	}
	public void setSubtitles(boolean subtitles) {
		this.subtitles = subtitles;
	}
	
	public String toString() {
		return "Movie: " + this.getName() + " - " + this.quality+ "(" + this.getYear() + ")";
	}
	
}
