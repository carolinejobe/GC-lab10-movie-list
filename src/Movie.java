import java.util.Comparator;

public class Movie {

	private String Title;
	private String Genre;

	public Movie(String title, String genre) {
		this.Title = title;
		this.Genre = genre;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		this.Genre = genre;
	}

	public static Comparator<Movie> MovieNameComparator = new Comparator<Movie>() {

		public int compare(Movie m1, Movie m2) {
		   String movie1 = m1.getTitle();
		   String movie2 = m2.getTitle();

		   //ascending order
		   return movie1.compareTo(movie2);
		}
	};
}
