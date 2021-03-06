package com.epsiyaya.projetvideoejb.metier.model;

import java.util.Date;
import org.joda.time.DateTime;

public class FilmLoue {

    private DateTime dateLocation;
    private Integer duree;
    private Film monFilmLoue;
    private Utilisateur monLoueur;

    public FilmLoue() {
    }

    public FilmLoue(Film MonFilmLoue, Utilisateur MonLoueur, DateTime DateLocation, Integer Duree) {
        monLoueur = MonLoueur;
        monFilmLoue = MonFilmLoue;
        duree = Duree;
        dateLocation = DateLocation;
    }

    public Utilisateur getMonLoueur() {
        return monLoueur;
    }

    public void setMonLoueur(Utilisateur monLoueur) {
        this.monLoueur = monLoueur;
    }

    public Film getMonFilmLoue() {
        return monFilmLoue;
    }

    public void setMonFilmLoue(Film monFilmLoue) {
        this.monFilmLoue = monFilmLoue;
    }

    public DateTime getDateTimeLocation() {
        return dateLocation;
    }

    public Date getDateLocation() {
        return dateLocation.toDate();
    }

    public void setDateLocation(Date date) {
        dateLocation = new DateTime(date);
    }

    public void setDateTimeLocation(DateTime date) {
        dateLocation = date;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer Duree) {
        duree = Duree;
    }
}