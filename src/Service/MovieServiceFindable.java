package Service;

import Interface.Findable;
import Model.Cast;
import Model.Movie;

import java.util.List;

public class MovieServiceFindable implements Findable {
    private List<Movie> movies;

    public MovieServiceFindable(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public List<Movie> getAllMovies() {
        return movies;
    }

    @Override
    public void findMovieByFullNameOrPartName(String name) {
        boolean found = false;
        for (Movie movie : movies) {
            if (movie.getName().contains(name)) {
                System.out.println(movie);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет такого фильма!");
        }
    }

    @Override
    public void findMovieByActorName(String nameActor) {
        boolean found = false;
        for (Movie movie : movies) {
            for (Cast actor : movie.getCast()) {
                if (actor.getActorFullName().contains(nameActor)) {
                    System.out.println(movie);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Нет такого актера!");
        }
    }

    @Override
    public void findMovieByYear(int year) {
        boolean found = false;
        for (Movie movie : movies) {
            if (movie.getYear() == year) {
                System.out.println(movie);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет фильма в этом году!");
        }
    }

    @Override
    public void findMovieByDirector(String name) {
        boolean found = false;
        for (Movie movie : movies) {
            if (movie.getDirector().getName().contains(name) || movie.getDirector().getLastName().contains(name)) {
                System.out.println(movie);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет фильма у этого режиссера!");
        }
    }

    @Override
    public void findMovieByGenre(String genre) {
        boolean found = false;
        for (Movie movie : movies) {
            if (movie.getGenre().contains(genre)) {
                System.out.println(movie);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет фильма с таким жанром!");
        }
    }

    @Override
    public void findMovieByRole(String role) {
        boolean found = false;
        for (Movie movie : movies) {
            for (Cast actor : movie.getCast()) {
                if (actor.getRole().contains(role)) {
                    System.out.println(movie);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Нет такого фильма с этой ролью!");
        }
    }
}
