package libraryInheritance;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		// von jedem Medium 5 Objekte anlegen
		
		// Creating five Book objects using provided Genres
        Book book1 = new Book("The Great Gatsby", 1925, "English", 19.99, Genre.CLASSICS, "A1", 16,
                "Scribner", 250, "F. Scott Fitzgerald", 9780743273565L);
        Book book2 = new Book("To Kill a Mockingbird", 1960, "English", 15.50, Genre.DRAMA, "B3", 15,
                "J. B. Lippincott & Co.", 320, "Harper Lee", 9780061120084L);
        Book book3 = new Book("1984", 1949, "English", 12.25, Genre.SCIENCE_FICTION, "C5", 17,
                "Secker & Warburg", 280, "George Orwell", 9780451524935L);
        Book book4 = new Book("The Catcher in the Rye", 1951, "English", 14.75, Genre.DRAMA, "D2", 16,
                "Little, Brown and Company", 200, "J.D. Salinger", 9780316769488L);
        Book book5 = new Book("Pride and Prejudice", 1813, "English", 10.00, Genre.ROMANCE, "E7", 14,
                "T. Egerton, Whitehall", 300, "Jane Austen", 9780141439518L);
		
        // Creating five AudioBook objects using provided Genres
        AudioBook audioBook1 = new AudioBook("The Hitchhiker's Guide to the Galaxy", 1979, "English", 24.99, Genre.SCIENCE_FICTION, "A1", 13,
                "Pan Books", 10, "MP3", "Douglas Adams");
        AudioBook audioBook2 = new AudioBook("Harry Potter and the Philosopher's Stone", 1997, "English", 29.50, Genre.FANTASY, "B3", 10,
                "Bloomsbury Publishing", 15, "AAC", "J.K. Rowling");
        AudioBook audioBook3 = new AudioBook("The Da Vinci Code", 2003, "English", 21.25, Genre.THRILLER, "C5", 16,
                "Doubleday", 12, "WAV", "Dan Brown");
        AudioBook audioBook4 = new AudioBook("The Alchemist", 1988, "Portuguese", 18.75, Genre.BIOGRAPHIES, "D2", 14,
                "HarperCollins", 8, "M4B", "Paulo Coelho");
        AudioBook audioBook5 = new AudioBook("The Hunger Games", 2008, "English", 19.00, Genre.YOUNG_ADULT, "E7", 12,
                "Scholastic Corporation", 11, "FLAC", "Suzanne Collins");
        
		// Creating five Movie objects
        Movie movie1 = new Movie("Inception", 2010, "English", 12.99, Genre.SCIENCE_FICTION, "A1", 13,
                "Warner Bros.", 150, "1080p", true);
        Movie movie2 = new Movie("The Godfather", 1972, "English", 9.99, Genre.CRIME, "B3", 18,
                "Paramount Pictures", 175, "720p", false);
        Movie movie3 = new Movie("The Matrix", 1999, "English", 11.50, Genre.ACTION_AND_ADVENTURE, "C5", 15,
                "Warner Bros.", 140, "4K", true);
        Movie movie4 = new Movie("Pulp Fiction", 1994, "English", 10.25, Genre.THRILLER, "D2", 18,
                "Miramax Films", 160, "1080p", false);
        Movie movie5 = new Movie("Forrest Gump", 1994, "English", 8.75, Genre.DRAMA, "E7", 13,
                "Paramount Pictures", 180, "720p", true);
		
        // Creating five Board Game objects
        Game game1 = new Game("Catan", 1995, "English", 39.99, Genre.CLASSICS, "A1", 10,
                "Catan Studio", 30, 4);
        Game game2 = new Game("Ticket to Ride", 2004, "English", 49.99, Genre.CLASSICS, "B3", 8,
                "Days of Wonder", 45, 5);
        Game game3 = new Game("Pandemic", 2008, "English", 44.99, Genre.CLASSICS, "C5", 10,
                "Z-Man Games", 40, 4);
        Game game4 = new Game("Codenames", 2015, "English", 19.99, Genre.CLASSICS, "D2", 12,
                "Czech Games Edition", 15, 8);
        Game game5 = new Game("Azul", 2017, "English", 39.99, Genre.CLASSICS, "E7", 8,
                "Plan B Games", 25, 4);
        
        // Creating five Magazine objects
        Magazine magazine1 = new Magazine("National Geographic", 1888, "English", 5.99, Genre.SCIENTIFIC, "A1", 0,
                "National Geographic Society", 100, "Various");
        Magazine magazine2 = new Magazine("Time", 1923, "English", 4.99, Genre.NEWS, "B3", 0,
                "Time USA, LLC", 80, "Various");
        Magazine magazine3 = new Magazine("Vogue", 1892, "English", 6.99, Genre.FASHION, "C5", 0,
                "Condé Nast", 120, "Various");
        Magazine magazine4 = new Magazine("Wired", 1993, "English", 3.99, Genre.TECHNOLOGY, "D2", 0,
                "Condé Nast", 90, "Various");
        Magazine magazine5 = new Magazine("The Economist", 1843, "English", 7.99, Genre.ECONOMICS, "E7", 0,
                "The Economist Group", 70, "Various");
        
		// 10 Kunden anlegen
        // Creating ten Customer objects
        Customer customer1 = new Customer("John", "Doe", LocalDate.of(1990, 5, 15));
        Customer customer2 = new Customer("Alice", "Smith", LocalDate.of(1985, 9, 22));
        Customer customer3 = new Customer("Bob", "Johnson", LocalDate.of(1995, 3, 8));
        Customer customer4 = new Customer("Emily", "Williams", LocalDate.of(1982, 12, 10));
        Customer customer5 = new Customer("Michael", "Brown", LocalDate.of(1988, 7, 4));
        Customer customer6 = new Customer("Sophia", "Jones", LocalDate.of(1992, 11, 18));
        Customer customer7 = new Customer("David", "Davis", LocalDate.of(1980, 6, 25));
        Customer customer8 = new Customer("Emma", "Garcia", LocalDate.of(1998, 4, 30));
        Customer customer9 = new Customer("James", "Martinez", LocalDate.of(1987, 2, 14));
        Customer customer10 = new Customer("Olivia", "Lee", LocalDate.of(1993, 10, 7));
		
		// 5 Reservierungen
        // Creating reservations with different media and customers
        Reservation reservation1 = new Reservation(customer1, book5);
        Reservation reservation2 = new Reservation(customer4, movie3);
        Reservation reservation3 = new Reservation(customer2, audioBook1);
        Reservation reservation4 = new Reservation(customer6, game3);
        Reservation reservation5 = new Reservation(customer9, magazine2);
		
		// 5 Entlehnungen
        Rental rental1 = new Rental(customer6, book5, LocalDate.of(2023, 11, 12));
        Rental rental2 = new Rental(customer2, movie3, LocalDate.of(2023, 11, 12));
        Rental rental3 = new Rental(customer5, audioBook1, LocalDate.of(2023, 11, 12));
        Rental rental4 = new Rental(customer1, game3, LocalDate.of(2023, 11, 12));
        Rental rental5 = new Rental(customer7, magazine2, LocalDate.of(2023, 11, 12));
	}

}
