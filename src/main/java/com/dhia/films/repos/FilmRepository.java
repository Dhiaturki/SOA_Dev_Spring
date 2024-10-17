package com.dhia.films.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dhia.films.entities.Genre;
import com.dhia.films.entities.Film;

@RepositoryRestResource(path = "rest")
public interface FilmRepository extends JpaRepository<Film, Long> {
    
    List<Film> findByNomFilm(String nom); // Changed nomProduit to nomFilm
    
    List<Film> findByNomFilmContains(String nom); // Changed nomProduit to nomFilm
    
    @Query("select f from Film f where f.nomFilm like %:nom and f.prixFilm > :prix") // Updated entity name and fields
    List<Film> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);

    @Query("select f from Film f where f.genre = ?1") // Changed from categorie to genre
    List<Film> findByGenre(Genre genre); // Changed categorie to genre
    
    List<Film> findByGenreIdGenre(Long id); // Changed categorieIdCat to genreIdGenre
    
    List<Film> findByOrderByNomFilmAsc(); // Changed nomProduit to nomFilm
    
    @Query("select f from Film f order by f.nomFilm ASC, f.prixFilm DESC") // Updated entity name and fields
    List<Film> trierFilmsNomsPrix(); // Changed method name to match the new context
}
