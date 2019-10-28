package SMcQ.movies.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity //Kertoo, että tämä luokka on Entity, eli käytännössä taulu tietokannassa
public class Movie {
	@Id //Movie-tietokantataulun pääavain
	@GeneratedValue(strategy=GenerationType.AUTO) //Käytetään pääavaimen kanssa, luomaan juoksevan id-arvon automaattisesti
	private long id;
	private String title, director, role;
	private int year, runtime;
	
	@ManyToOne
	@JoinColumn(name = "genreid") //liittää genre -> movie
	private Genre genre;
	
	public Movie() {
	}
	
	public Movie(String title, String director, String role, int year, int runtime, Genre genre) {
		super();
		this.title = title;
		this.director = director;
		this.role = role;
		this.year = year;
		this.runtime = runtime;
		this.genre = genre;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		if (this.genre != null)
			return "Movie [id=" + id + ", title=" + title + ", director=" + director + ", role=" + role + ", year=" + year + ", runtime=" + runtime + " genre =" + this.getGenre() + "]";		
		else
			return "Movie [id=" + id + ", title=" + title + ", director=" + director + ", role=" + role + ", year=" + year + ", runtime=" + runtime + "]";
	}
}