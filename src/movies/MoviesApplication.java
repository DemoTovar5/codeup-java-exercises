package movies;

import util.Input;

public class MoviesApplication {

    private static void getNames(Movie[] movies, String category) {
        for (int i = 0; i < movies.length; i++) {
            if (category != null) {
                if (movies[i].getCategory().equals(category)) {
                    System.out.println(movies[i].getName());
                }
            } else {
                System.out.println(movies[i].getName());
            }
        }
    }

    public static void main(String[] args) {


        System.out.println("What would you like to do?\n\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the sci-fi category\n"
        );

        Input userInput = new Input();

        Movie[] allMovies = MoviesArray.findAll();


        switch (userInput.getInt(0, 5)) {


            case 0:
                System.out.println("See you again!");
                break;
            case 1:
                getNames(allMovies, null);
                break;
            case 2:
                getNames(allMovies, "animated");
                break;
            case 3:
                getNames(allMovies, "drama");
                break;
            case 4:
                getNames(allMovies, "horror");
                break;
            case 5:
                getNames(allMovies, "sci-fi");
                break;
            default:
                System.out.println("Choose something else");
        }

    }




}
