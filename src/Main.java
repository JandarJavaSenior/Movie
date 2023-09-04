import Model.Cast;
import Model.Director;
import Model.Movie;
import Service.MovieServiceFindable;
import Service.MovieServiceSortable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Джеймс","Кэмерон");

        Cast cast1 = new Cast("Сэм Уортингтон","Джейк Сали");
        Cast cast2 = new Cast("Зои Салдана","Нейтири");
        Cast cast3 = new Cast("Сигурни Уивер","Кири");
        Cast cast4 = new Cast( "Кейт Уинсолед","Ронал");
        Cast cast5 = new Cast("Джейк Чэмпион","Спайдер");
        List<Cast> casts = new ArrayList<>(List.of(cast1,cast2,cast3,cast4,cast5));

        Director director2 = new Director("Кристофер", "Нолан");

        Cast cast6 = new Cast("Леонардо ДиКаприо", "Доминик Кобб");
        Cast cast7 = new Cast("Джозеф Гордон-Левитт", "Артур");
        Cast cast8 = new Cast("Эллен Пейдж", "Ариадна");
        List<Cast> casts2 = new ArrayList<>(List.of(cast6, cast7, cast8));

        Director director3 = new Director("Квентин", "Тарантино");

        Cast cast9 = new Cast("Джейми Фокс", "Джанго Фриман");
        Cast cast10 = new Cast("Кристоф Вальц", "Доктор Кинг Шульц");
        Cast cast11 = new Cast("Леонардо ДиКаприо", "Кэнди");
        List<Cast> casts3 = new ArrayList<>(List.of(cast9, cast10, cast11));

        Movie movie = new Movie("Аватар",2009,"Боевик,Приключения",director,casts);
        Movie movie2 = new Movie("Начало", 2010, "Фантастика, Триллер", director2, casts2);
        Movie movie3 = new Movie("Джанго освобождённый", 2012, "Драма, Вестерн", director3, casts3);
        List<Movie> movies = new LinkedList<>(List.of(movie,movie2,movie3));
        MovieServiceFindable movieServiceFindable= new MovieServiceFindable(movies);
        MovieServiceSortable movieServiceSortable = new MovieServiceSortable(movies);

//        movieServiceSortable.sortByMovieName();
//        movieServiceSortable.sortByMovieNameDesc();
//        movieServiceSortable.sortByYear1();
//        movieServiceSortable.sortByYear2();


//        System.out.println(movieServiceFindable.getAllMovies());
//        movieServiceFindable.findMovieByFullNameOrPartName("Аватар");
//        movieServiceFindable.findMovieByActorName("Леонардо");
//        movieServiceFindable.findMovieByYear(2010);
//        movieServiceFindable.findMovieByDirector("Кэмерон");
//        movieServiceFindable.findMovieByGenre("Прикл");
//        movieServiceFindable.findMovieByRole("Кири");




        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Поиск");
            System.out.println("2. Фильтр");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Выберите тип поиска:");
                    System.out.println("1. Получить все фильмы");
                    System.out.println("2. Получить фильм по имени");
                    System.out.println("3. Получить фильм по имени актера");
                    System.out.println("4. Получить фильм по году");
                    System.out.println("5. Получить фильм по режиссеру");
                    System.out.println("6. Получить фильм по жанру");
                    System.out.println("7. Получить фильм по роли");
                    int searchChoice = scanner.nextInt();

                    switch (searchChoice) {
                        case 1:
                            System.out.println(movieServiceFindable.getAllMovies());                           break;
                        case 2:
                            String a = scanner.next();
                            movieServiceFindable.findMovieByFullNameOrPartName(a);
                            break;
                        case 3:
                            String s = scanner.next();
                            movieServiceFindable.findMovieByActorName(s);
                            break;
                        case 4:
                            int q = scanner.nextInt();
                            movieServiceFindable.findMovieByYear(q);
                            break;
                        case 5:
                            String d = scanner.next();
                            movieServiceFindable.findMovieByDirector(d);
                            break;
                        case 6:
                            String f = scanner.next();
                            movieServiceFindable.findMovieByGenre(f);
                            break;
                        case 7:
                            String g = scanner.next();
                            movieServiceFindable.findMovieByRole(g);
                            break;
                        default:
                            System.out.println("Некорректный выбор для поиска.");
                    }
                    break;
                case 2:
                    System.out.println("Выберите тип фильтра:");
                    System.out.println("1. Получить все фильма от A до Z");
                    System.out.println("2. Получить все фильмы от Z до A");
                    System.out.println("3. Получить фильмы по увеличению года");
                    System.out.println("4. Получить фильмы по уменьшению года");
                    System.out.println("5. Получить фильм по режиссеру");
                    int selectedFilter = scanner.nextInt();

                    switch (selectedFilter) {
                        case 1:
                            System.out.println("Получить все фильма от A до Z");
                            System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖");
                            movieServiceSortable.sortByMovieName();
                            System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖");

                            break;
                        case 2:
                            System.out.println("Получить все фильмы от Z до A");
                            System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖");
                            movieServiceSortable.sortByMovieNameDesc();
                            System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖");

                            break;
                        case 3:
                            System.out.println("Получить фильмы по увеличению года");
                            System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖");
                            movieServiceSortable.sortByYear1();
                            System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖");

                            break;
                        case 4:
                            System.out.println("Получить фильмы по уменьшению года");
                            System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖");
                            movieServiceSortable.sortByYear2();
                            System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖");

                            break;
                        case 5:
                            System.out.println("5. Получить фильм по режиссеру");
                            System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖");
                            movieServiceSortable.sortByDirector();
                            System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖");
                            break;
                        default:
                            System.out.println("Неправильно выбран фильтр.");
                    }
                default:
                    System.out.println("");
            }
        }


    }
}