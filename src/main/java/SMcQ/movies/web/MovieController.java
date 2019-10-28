package SMcQ.movies.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import SMcQ.movies.domain.GenreRepository;
import SMcQ.movies.domain.Movie;
import SMcQ.movies.domain.MovieRepository;

@Controller //kertoo, että tämä luokka on kontrolleriluokka. Tehdyt kontrollerit käsittelevät käyttäjän pyynnön tiettyyn endpointiin (esim. /movielist) ja palauttaa vastauksena esimerkin tapauksessa html-sivun movielist.html
public class MovieController {
	@Autowired
	private MovieRepository repository;
	
	@Autowired
	private GenreRepository grepository;
	
	//Listaa kaikki elokuvat
	@RequestMapping(value = {"/", "/movielist"})
	public String movielist(Model model) {
		model.addAttribute("movies", repository.findAll());
		return "movielist";
	}
	
	//Lisää uusi elokuva
	@GetMapping("add") //sama asia kuin @RequestMapping(value = {"/add"})
	public String addMovie(Model model) {
		model.addAttribute("movie", new Movie());
		model.addAttribute("genres", grepository.findAll());
		return "addmovie";
	}
	
	//Tallenna uusi elokuva
	@PostMapping("save")
	public String saveMovie(Movie movie) {
		repository.save(movie);
		return "redirect:movielist"; //Palaa sivulle movielist.html
	}
	
	//Muokkaa olemassa olevaa elokuvaa
	@GetMapping("edit/{id}")
	public String updateMovie(@PathVariable("id")Long movieId, Model model) {
	model.addAttribute("movie",repository.findById(movieId));
	model.addAttribute("genres", grepository.findAll());
	return "editmovie";
	}
	
	//Poista elokuva	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteMovie(@PathVariable("id") Long id, Model model) {
    	System.out.println("film "  + id);
    	repository.deleteById(id);
    	return "redirect:../movielist";
    }
}