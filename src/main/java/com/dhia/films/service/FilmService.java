package com.dhia.films.service;

import java.util.List;

import com.dhia.films.entities.Genre;
import com.dhia.films.entities.Film;

public interface FilmService {
	
	Film saveFilm(Film film);
	Film updateFilm(Film film);
	void deleteFilm(Film film);
	void deleteFilmById(Long id);
	Film getFilm(Long id);
	List<Film> getAllFilms();
	
	List<Film> findByNomFilm(String nom);
	List<Film> findByNomFilmContains(String nom);
	List<Film> findByNomPrix(String nom, Double prix);
	List<Film> findByGenre(Genre genre);
	List<Film> findByGenreIdGenre(Long id);
	List<Film> findByOrderByNomFilmAsc();
	List<Film> trierFilmsNomsPrix();
}
