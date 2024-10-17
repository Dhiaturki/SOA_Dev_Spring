package com.dhia.films.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Film {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFilm;
    private String nomFilm;
    private Double prixFilm;
    private Date datePub;

    @ManyToOne
    private Genre genre; // Changed from categorie to genre
    
    // Default constructor
    public Film() {
        super();
    }

    // Constructor with parameters
    public Film(String nomFilm, Double prixFilm, Date datePub) {
        super();
        this.nomFilm = nomFilm;
        this.prixFilm = prixFilm;
        this.datePub = datePub;
    }

    // Getters and Setters
    public Long getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Long idFilm) {
        this.idFilm = idFilm;
    }

    public String getNomFilm() {
        return nomFilm;
    }

    public void setNomFilm(String nomFilm) {
        this.nomFilm = nomFilm;
    }

    public Double getPrixFilm() {
        return prixFilm;
    }

    public void setPrixFilm(Double prixFilm) {
        this.prixFilm = prixFilm;
    }

    public Date getDatePub() {
        return datePub;
    }

    public void setDatePub(Date datePub) {
        this.datePub = datePub;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film [idFilm=" + idFilm + ", nomFilm=" + nomFilm + ", prixFilm=" + prixFilm
                + ", datePub=" + datePub + ", genre=" + genre + "]";
    }
}
