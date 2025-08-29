package ru.netology.domain;

public class PosterItem {
    private String filmName;

    public PosterItem(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }
}
