package Service;

import Interface.Sortable;
import Model.Movie;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class MovieServiceSortable implements Sortable {
    private List<Movie> movies;

    public MovieServiceSortable(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
    private static class sortAZ implements Comparator<Movie> {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    private static class sortZA implements Comparator<Movie> {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };

    @Override
    public void sortByMovieName() {
        Collections.sort(movies, new sortAZ()); //(A-Z)
        for (Movie m:movies) {
            System.out.println(m.getName());
        }

    }

    public void sortByMovieNameDesc() {
        Collections.sort(movies,new sortZA()); //(Z-A)
        for (Movie m:movies) {
            System.out.println("Фильм: "+m.getName());
        }
    }

    @Override
    public void sortByYear1() {
        Collections.sort(movies, new SortByYearAscending());
        for (Movie m:movies) {
            System.out.println("Фильм: "+m.getName());
            System.out.println("Год: "+m.getYear());
            System.out.println("");
        }
    }

    @Override
    public void sortByYear2() {
        Collections.sort(movies, new SortByYearDescending());
        for (Movie m:movies) {
            System.out.println("Фильм: "+m.getName());
            System.out.println("Год: "+m.getYear());
        }
    }

    @Override
    public void sortByDirector() {
        Collections.sort(movies, new SortByDirector());
        for (Movie m:movies) {
            System.out.println("Фильм: "+m.getName());
            System.out.println("Режисер: "+m.getDirector().getName()+" "+m.getDirector().getLastName());
        }
    }

    private static class SortByYearAscending implements Comparator<Movie> {
        @Override
        public int compare(Movie o1, Movie o2) {
            return Integer.compare(o1.getYear(), o2.getYear());
        }
    }

    private static class SortByYearDescending implements Comparator<Movie> {
        @Override
        public int compare(Movie o1, Movie o2) {
            return Integer.compare(o2.getYear(), o1.getYear());
        }
    }

    private static class SortByDirector implements Comparator<Movie> {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }
    }
}

