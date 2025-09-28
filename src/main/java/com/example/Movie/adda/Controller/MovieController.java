package com.example.Movie.adda.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.Movie.adda.Entity.Movie;
import com.example.Movie.adda.Repository.MovieRepository;

@Controller
public class MovieController {
@Autowired
MovieRepository repo;

@GetMapping("/")
public String main() {
	return "main";
}

@GetMapping("/insert")
	public String insert() {
		return "insert";
	}


@PostMapping("/save")
public String insertData( Movie movie) {
	repo.save(movie);
	return "main";
}

@GetMapping("/view")
public String fetchall(Model model) {
	List<Movie> movies = repo.findAll();
	model.addAttribute("movies",movies);
	return "view";
}

@GetMapping("/delete")
public String deletebyid(@RequestParam Long id) {
	repo.deleteById(id);
	return "redirect:/view";
}
@GetMapping("/edit")
public String edit(@RequestParam Long id ,Model model) {
	Movie movie = repo.findById(id).orElse(null);
	model.addAttribute("movie",movie);
	return "edit";
}
@PostMapping("/update")
public String update(Movie movie) {
	repo.save(movie);
	return "redirect:/view";
}
}
