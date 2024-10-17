package com.dhia.films.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhia.films.entities.Genre;
import com.dhia.films.entities.Film;
import com.dhia.films.repos.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    FilmRepository filmRepository;
    
    @Override
    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public Film updateFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public void deleteFilm(Film film) {
        filmRepository.delete(film);
    }

    @Override
    public void deleteFilmById(Long id) {
        filmRepository.deleteById(id);
    }

    @Override
    public Film getFilm(Long id) {
        return filmRepository.findById(id).get();
    }

    @Override
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }
    
    @Override
    public List<Film> findByNomFilm(String nom) {
        return filmRepository.findByNomFilm(nom);
    }

    @Override
    public List<Film> findByNomFilmContains(String nom) {
        return filmRepository.findByNomFilmContains(nom);
    }

    @Override
    public List<Film> findByNomPrix(String nom, Double prix) {
        return filmRepository.findByNomPrix(nom, prix);
    }
    
    @Override
    public List<Film> findByGenre(Genre genre) {
        return filmRepository.findByGenre(genre);
    }

    @Override
    public List<Film> findByGenreIdGenre(Long id) {
        return filmRepository.findByGenreIdGenre(id);
    }

    @Override
    public List<Film> findByOrderByNomFilmAsc() {
        return filmRepository.findByOrderByNomFilmAsc();
    }

    @Override
    public List<Film> trierFilmsNomsPrix() {
        return filmRepository.trierFilmsNomsPrix();
    }
}
