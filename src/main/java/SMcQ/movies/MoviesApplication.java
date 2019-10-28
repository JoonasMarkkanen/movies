package SMcQ.movies;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import SMcQ.movies.domain.Genre;
import SMcQ.movies.domain.GenreRepository;
import SMcQ.movies.domain.Movie;
import SMcQ.movies.domain.MovieRepository;
import SMcQ.movies.domain.User;
import SMcQ.movies.domain.UserRepository;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args); //komento käynnistää applikaation
	}

	@Bean
	public CommandLineRunner demo(MovieRepository mrepository, GenreRepository grepository, UserRepository urepository){
	return (args) -> {
		//tallentaa GenreRepositorioon uuden genren
		grepository.save(new Genre("Action"));
		grepository.save(new Genre("Adventure"));
		grepository.save(new Genre("Biography"));
		grepository.save(new Genre("Comedy"));
		grepository.save(new Genre("Crime"));
		grepository.save(new Genre("Documentary"));
		grepository.save(new Genre("Drama"));
		grepository.save(new Genre("History"));
		grepository.save(new Genre("Horror"));
		grepository.save(new Genre("Mystery"));
		grepository.save(new Genre("Romance"));
		grepository.save(new Genre("Sci-Fi"));
		grepository.save(new Genre("Sport"));
		grepository.save(new Genre("Thriller"));
		grepository.save(new Genre("War"));
		grepository.save(new Genre("Western"));
		
		//tehdään uusi tietokantaan tallennettava Movie-objekti
		Movie m1 = new Movie("Girl on the Run", "Arthur J. Beckhard, Joseph Lee", "Uncredited", 1953, 64, grepository.findByName("Crime").get(0));
		Movie m2 = new Movie("Somebody Up There Likes Me", "Robert Wise", "Fidel", 1956, 114, grepository.findByName("Biography").get(0));
		Movie m3 = new Movie("Never Love a Stranger", "Robert Stevens", "Martin Cabell", 1958, 91, grepository.findByName("Crime").get(0));
		Movie m4 = new Movie("The Blob", "Irvin Yeaworth", "Steve Andrews", 1958, 86, grepository.findByName("Horror").get(0));
		Movie m5 = new Movie("The Great St. Louis Bank Robbery", "Charles Guggenheim, John Stix", "George Fowler", 1959, 89, grepository.findByName("Crime").get(0));
		Movie m6 = new Movie("Never So Few", "John Sturges", "Bill Ringa", 1959, 124, grepository.findByName("War").get(0));
		Movie m7 = new Movie("The Magnificent Seven", "John Sturges", "Vin Tanner", 1960, 128, grepository.findByName("Western").get(0));
		Movie m8 = new Movie("The Honeymoon Machine", "Richard Thorpe", "Ferguson Howard", 1961, 84, grepository.findByName("Romance").get(0));
		Movie m9 = new Movie("Hell Is for Heroes", "Don Siegel", "John Reese", 1962, 90, grepository.findByName("War").get(0));
		Movie m10 = new Movie("The War Lover", "Philip Leacock", "Buzz Rickson", 1962, 105, grepository.findByName("Adventure").get(0));
		Movie m11 = new Movie("The Great Escape", "John Sturges", "Virgil Hilts (The Cooler King)", 1963, 172, grepository.findByName("History").get(0));
		Movie m12 = new Movie("Soldier in the Rain", "Ralph Nelson", "Eustis Clay", 1963, 96, grepository.findByName("Comedy").get(0));
		Movie m13 = new Movie("Love with the Proper Stranger", "Robert Mulligan", "Rocky Papasano", 1963, 102, grepository.findByName("Romance").get(0));
		Movie m14 = new Movie("Baby the Rain Must Fall", "Robert Mulligan", "Henry Thomas", 1965, 100, grepository.findByName("Drama").get(0));
		Movie m15 = new Movie("The Cincinnati Kid", "Norman Jewison", "Eric Stoner (The Cincinnati Kid)", 1965, 102, grepository.findByName("Drama").get(0));
		Movie m16 = new Movie("Nevada Smith", "Henry Hathaway", "Max Sand (Nevada Smith)", 1966, 128, grepository.findByName("Western").get(0));
		Movie m17 = new Movie("The Sand Pebbles", "Robert Wise", "Jake Holman", 1966, 182, grepository.findByName("War").get(0));
		Movie m18 = new Movie("The Thomas Crown Affair", "Norman Jewison", "Thomas Crown", 1968, 102, grepository.findByName("Thriller").get(0));
		Movie m19 = new Movie("Bullitt", "Peter Yates", "Frank Bullitt", 1968, 113, grepository.findByName("Action").get(0));
		Movie m20 = new Movie("The Reivers", "Mark Rydell", "Boon Hogganbeck", 1969, 107, grepository.findByName("Drama").get(0));
		Movie m21 = new Movie("Le Mans", "Lee H. Katzin", "Michael Delaney", 1971, 106, grepository.findByName("Sport").get(0));
		Movie m22 = new Movie("On Any Sunday", "Bruce Brown", "Himself", 1971, 96, grepository.findByName("Documentary").get(0));
		Movie m23 = new Movie("Junior Bonner", "Sam Peckinpah", "Junior 'JR' Bonner", 1972, 100, grepository.findByName("Western").get(0));
		Movie m24 = new Movie("The Getaway", "Sam Peckinpah", "Carter 'Doc' McCoy", 1972, 122, grepository.findByName("Crime").get(0));
		Movie m25 = new Movie("Papillon", "Franklin J. Schaffner", "Henri Charrière", 1973, 150, grepository.findByName("Biography").get(0));
		Movie m26 = new Movie("The Towering Inferno", "John Guillermin", "Michael O'Hallorhan", 1974, 165, grepository.findByName("Thriller").get(0));
		Movie m27 = new Movie("An Enemy of the People", "George Schaefer", "Thomas Stockmann", 1978, 103, grepository.findByName("Drama").get(0));
		Movie m28 = new Movie("Tom Horn", "William Wiard", "Tom Horn", 1980, 98, grepository.findByName("Western").get(0));
		Movie m29 = new Movie("The Hunter", "Buzz Kulik", "Ralph 'Papa' Thorson", 1980, 97, grepository.findByName("Biography").get(0));

	//tallennetaan luodut objektit MovieRepositoryyn
	mrepository.save(m1);
	mrepository.save(m2);
	mrepository.save(m3);
	mrepository.save(m4);
	mrepository.save(m5);
	mrepository.save(m6);
	mrepository.save(m7);
	mrepository.save(m8);
	mrepository.save(m9);
	mrepository.save(m10);
	mrepository.save(m11);
	mrepository.save(m12);
	mrepository.save(m13);
	mrepository.save(m14);
	mrepository.save(m15);
	mrepository.save(m16);
	mrepository.save(m17);
	mrepository.save(m18);
	mrepository.save(m19);
	mrepository.save(m20);
	mrepository.save(m21);
	mrepository.save(m22);
	mrepository.save(m23);
	mrepository.save(m24);
	mrepository.save(m25);
	mrepository.save(m26);
	mrepository.save(m27);
	mrepository.save(m28);
	mrepository.save(m29);
		
	//tehdään uusi käyttäjä-objekti kryptatuilla salasanoilla
	User user1 = new User("user", "$2a$10$MbUmI4cHPyJIIZSkVMIPQ.XbqKiPTSBJm1/VWniR9lwzGjHr9c2Aa", "USER");
	User user2 = new User("admin", "$2a$10$6E3ZzzvrWiIGOyTjb1PlzupezdpQBfFojfL/rDfgNKe313EKFE.Ky", "ADMIN");
	
	//tallennetaan luodut käyttäjäobjektit UserRepositoryyn
	urepository.save(user1);
	urepository.save(user2);
	};
	}
}
