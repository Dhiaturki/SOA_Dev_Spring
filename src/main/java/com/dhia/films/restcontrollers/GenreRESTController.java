package com.dhia.films.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.dhia.films.entities.Genre;  // Update the import to use Genre
import com.dhia.films.repos.GenreRepository;  // Update the repository import

@RestController
@RequestMapping("/api/genre")  // Update the API path to reflect Genre
@CrossOrigin("*")
public class GenreRESTController {

    @Autowired
    GenreRepository genreRepository;  // Change to GenreRepository

    @RequestMapping(method = RequestMethod.GET)
    public List<Genre> getAllGenres() {  // Update method name
        return genreRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Genre getGenreById(@PathVariable("id") Long id) {  // Update method name and return type
        return genreRepository.findById(id).get();  // Use orElse(null) to avoid NoSuchElementException
    }
}