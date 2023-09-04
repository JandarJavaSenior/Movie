package Interface;

import Model.Movie;

import java.util.List;

public interface Findable {
    List<Movie> getAllMovies();

    void findMovieByFullNameOrPartName(String name);

    void findMovieByActorName(String nameActor);

    void findMovieByYear(int year);

    void findMovieByDirector(String name);

    void findMovieByGenre(String ganre);

    void findMovieByRole(String role);
}
