package com.dhia.films;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dhia.films.entities.Genre;
import com.dhia.films.entities.Film;
import com.dhia.films.repos.FilmRepository;

@SpringBootTest
class FilmsApplicationTests {

    @Autowired
    private FilmRepository filmRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testCreateFilm() {
        // Creating a film with real data
        Film film = new Film("Inception", 14.99, new Date()); // Pricing can be adjusted
        filmRepository.save(film);
    }

    @Test
    public void testFindFilm() {
        Film film = filmRepository.findById(1L).get();
        System.out.println(film);
    }

    @Test
    public void testUpdateFilm() {
        Film film = filmRepository.findById(1L).get();
        film.setPrixFilm(9.99); // Updating the price
        filmRepository.save(film);
    }

    @Test
    public void testDeleteFilm() {
        filmRepository.deleteById(1L);
    }

    @Test
    public void testListerTousFilms() {
        List<Film> films = filmRepository.findAll();
        for (Film film : films) {
            System.out.println(film);
        }
    }

    @Test
    public void testFindByNomFilm() {
        List<Film> films = filmRepository.findByNomFilm("Inception");
        for (Film film : films) {
            System.out.println(film);
        }
    }

    @Test
    public void testFindByNomFilmContains() {
        List<Film> films = filmRepository.findByNomFilmContains("Incep");
        for (Film film : films) {
            System.out.println(film);
        }
    }

    @Test
    public void testFindByNomPrix() {
        List<Film> films = filmRepository.findByNomPrix("Inception", 14.99);
        for (Film film : films) {
            System.out.println(film);
        }
    }

    @Test
    public void testFindByGenre() {
        Genre genre = new Genre();
        genre.setIdGenre(1L); // Ensure this ID corresponds to a genre in your database
        List<Film> films = filmRepository.findByGenre(genre);
        for (Film film : films) {
            System.out.println(film);
        }
    }

    @Test
    public void testFindByGenreId() {
        List<Film> films = filmRepository.findByGenreIdGenre(1L); // Adjust based on your genre IDs
        for (Film film : films) {
            System.out.println(film);
        }
    }

    @Test
    public void testFindByOrderByNomFilmAsc() {
        List<Film> films = filmRepository.findByOrderByNomFilmAsc();
        for (Film film : films) {
            System.out.println(film);
        }
    }

    @Test
    public void testTrierFilmsNomsPrix() {
        List<Film> films = filmRepository.trierFilmsNomsPrix();
        for (Film film : films) {
            System.out.println(film);
        }
    }
}
