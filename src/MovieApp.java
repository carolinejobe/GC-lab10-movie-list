import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Caroline
 *
 *         Lab 10: Movies by Category
 *
 *         The application will: -store a list of movies and display them by
 *         category. -user can enter any of 4 categories to display films in the
 *         list that match the category. -after list is displayed, user is asked
 *         if she wants to continue. If no, program ends. 
 *         
 *         Specs: 1. Each movie should be represented by an object of type Movie. The Movie class
 *         must provide two private fields: title and genre. Both of these
 *         fields should be Strings. The class should also provide a constructor
 *         that accepts a title and category as parameters and uses the values
 *         passed to it to initialize its fields.
 *         2. When the user enters a category, the program should read through all of the movies in the ArrayList and display a line for any movie whose category matches the category entered by the user. 
 *         3. Sufficient tests should be present.
 *         
 *         Extended Exercises:
 *         -option for user to add their own movie to the list.
 */
public class MovieApp {
	ArrayList<Movie> movieCollection1;

	public static void main(String[] args) {

		String play = "y"; // initialize object to enter while loop
		System.out.println("Welcome to the Grand Circus Movie List!");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		ArrayList<Movie> movieCollection1 = new ArrayList<Movie>();

		movieCollection1.add(new Movie("Brooklyn", "drama"));
		movieCollection1.add(new Movie("Forrest Gump", "drama"));
		movieCollection1.add(new Movie("The Godfather", "drama"));
		movieCollection1.add(new Movie("Life is Beautiful", "drama"));
		movieCollection1.add(new Movie("One Flew Over the Cuckoo's Nest", "drama"));

		movieCollection1.add(new Movie("Trainwreck", "comedy"));
		movieCollection1.add(new Movie("The Hangover", "comedy"));
		movieCollection1.add(new Movie("Clueless", "comedy"));
		movieCollection1.add(new Movie("Ferris Bueller's Day Off", "comedy"));
		movieCollection1.add(new Movie("Superbad", "comedy"));

		movieCollection1.add(new Movie("Interstellar", "scifi"));
		movieCollection1.add(new Movie("The Martian", "scifi"));
		movieCollection1.add(new Movie("Star Wars", "scifi"));
		movieCollection1.add(new Movie("Back to the Future", "scifi"));
		movieCollection1.add(new Movie("WALL-E", "scifi"));

		movieCollection1.add(new Movie("The Ring", "horror"));
		movieCollection1.add(new Movie("It", "horror"));
		movieCollection1.add(new Movie("Psycho", "horror"));
		movieCollection1.add(new Movie("The Shining", "horror"));
		movieCollection1.add(new Movie("Rosemary's Baby", "horror"));

		while (play.equalsIgnoreCase("y")) {

			String userChoice = ValidateString
					.getChoice("Would you like to see a list or add a movie title? (see/add)");

			//user wants to view lists
			if (userChoice.equalsIgnoreCase("see")) {

				String userGenre = ValidateString.getGenre("Enter a genre: (drama/comedy/scifi/horror) ");

				Collections.sort(movieCollection1, Movie.MovieNameComparator);
				for (int i = 0; i < movieCollection1.size(); i++) {
					Movie movie = movieCollection1.get(i);
					if (movie.getGenre().equals(userGenre)) {
						System.out.println(movie.getTitle());
					}
				}
			//user wants to add a title to the list	
			} else {
				String userGenre = ValidateString.getGenre("Enter your movie's genre: (drama/comedy/scifi/horror)");
				String userTitle = ValidateString.getUserTitle("Enter your movie's title: ");
				Movie movie = new Movie(userTitle, userGenre);
				movieCollection1.add(movie);
				Collections.sort(movieCollection1, Movie.MovieNameComparator);

				for (int i = 0; i < movieCollection1.size(); i++) {
					Movie movieA = movieCollection1.get(i);
					if (movieA.getGenre().equals(userGenre)) {
						System.out.println(movieA.getTitle());
					}
				}
			}

			System.out.println(" ");
			play = ValidateString.continueOrQuit("Would you like to continue? (y/n) ");

		}
		System.out.println("Goodbye.");
	}
}
