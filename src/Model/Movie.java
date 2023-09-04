package Model;

import Model.Cast;
import Model.Director;

import java.util.List;

public class Movie {
    private String name;
    private int year;
    private String genre;
    private Director director;
    private List<Cast>cast;

    public Movie(String name, int year, String genre, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }


    @Override
    public String toString() {
        return "Фильм: \n" +
                "Название фильма " + name + '\n' +
                "Год выхода : " + year + '\n' +
                "Жанр: " + genre +  '\n' +
                "Директор: 🔴\n" + director + '\n' +
                "Актеры: 🟢\n" + cast + '\n'+ '\n' + '\n' + '\n' ;
    }
}
