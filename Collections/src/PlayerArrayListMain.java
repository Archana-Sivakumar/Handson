import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerArrayListMain {

	public static void main(String[] args) {
		List<Player> playerList = new ArrayList<Player>();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number of players");
		int noOfPlayers = s.nextInt();
		s.nextLine();

		String[] name = new String[noOfPlayers];
		String[] country = new String[noOfPlayers];
		String[] skill = new String[noOfPlayers];

		for (int i = 0; i < noOfPlayers; i++) {

			System.out.println("Enter the player name");
			name[i] = s.next();

			System.out.println("Enter the country name");
			country[i] = s.next();

			System.out.println("Enter the skill");
			skill[i] = s.next();
			playerList.add(new Player(name[i], country[i], skill[i]));

		}

		PlayerMethod player = new PlayerMethod();
		player.displayAllPlayerDetails(playerList);

	}
}
