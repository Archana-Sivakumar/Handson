import java.util.Scanner;

public class PlayerDetailsMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Menu \r\n" + "1.Cricket Player Details \r\n" + "2.Hockey Player Details ");
		String name;
		String teamName;
		int noOfMatches;
		int totalRunsScored;
		int noOfWicketsTaken;
		String position;
		int noOfGoals;

		System.out.println("Enter choice");
		int option = s.nextInt();

		if (option == 1) {
			s.nextLine();
			System.out.println("Enter player name");
			name = s.nextLine();

			System.out.println("Enter team name");
			teamName = s.nextLine();

			System.out.println("Enter number of matches played");
			noOfMatches = s.nextInt();

			System.out.println("Enter total runs scored");
			totalRunsScored = s.nextInt();

			System.out.println("Enter total number of wickets taken");
			noOfWicketsTaken = s.nextInt();

			IPlayerStatistics iplayerStatistics = new CricketPlayer(name, teamName, noOfMatches, totalRunsScored,
					noOfWicketsTaken);
			iplayerStatistics.displayPlayerStatistics();
		}

		if (option == 2) {
			s.nextLine();
			System.out.println("Enter player name");
			name = s.nextLine();

			System.out.println("Enter team name");
			teamName = s.nextLine();

			System.out.println("Enter number of matches played");
			noOfMatches = s.nextInt();

			System.out.println("Enter the position");
			position = s.next();

			System.out.println("Enter total number of goals taken");
			noOfGoals = s.nextInt();

			IPlayerStatistics iplayerStatistics = new HockeyPlayer(name, teamName, noOfMatches, position, noOfGoals);
			iplayerStatistics.displayPlayerStatistics();
		}

	}

}
