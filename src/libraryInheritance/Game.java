package libraryInheritance;

public class Game extends Medium{

	private int noOfPlayers;
	
	public Game() {
		super();
	}
	
	

	public Game(String name, int year, String language, double price, Genre genre, String placement, int ageLimit,
			String publisher, int extent, int noOfPlayers) {
		super(name, year, language, price, genre, placement, ageLimit, publisher, extent);
		this.noOfPlayers = noOfPlayers;
	}



	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	
	public String toString() {
		return "Game: " + this.getName() +  "(number of players: " + this.noOfPlayers + ")";
	}
	
}
