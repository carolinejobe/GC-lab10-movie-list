import java.util.Scanner;

public class ValidateString {

	static Scanner input = new Scanner(System.in);
	static String play;

	// prompt user to input, validate for input to be double
	public static String getGenre(String prompt) {
		System.out.println(prompt);
		String answer = input.nextLine().toLowerCase();
		while (!answer.equalsIgnoreCase("drama") && !answer.equalsIgnoreCase("comedy")
				&& !answer.equalsIgnoreCase("scifi") && !answer.equalsIgnoreCase("horror")) {
			System.out.println("You have entered invalid data. " + prompt);
			answer = input.nextLine();
			continue;
		}
		return answer;
	}
	
	public static String getChoice(String prompt) {
		System.out.println(prompt);
		String answer = input.nextLine().toLowerCase();
		while (!answer.equalsIgnoreCase("see") && !answer.equalsIgnoreCase("add")) {
			System.out.println("You have entered invalid data. " + prompt);
			answer = input.nextLine();
			continue;
		}
		return answer;
	}

	static String continueOrQuit(String prompt) {
		System.out.println(prompt);
		play = input.nextLine();
		while (!play.equalsIgnoreCase("Y") && !play.equalsIgnoreCase("N")) {
			System.out.println("Invalid input." + prompt);
			play = input.nextLine();
			continue;
		}
		return play;
	}

	static String getUserTitle(String prompt) {
		System.out.println(prompt);
		return input.nextLine();
	}

}
