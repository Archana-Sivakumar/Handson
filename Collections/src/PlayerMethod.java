import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayerMethod {

	public void displayAllPlayerDetails(List<Player> playerList) {
		System.out.println("Player Details");
		for (Player p : playerList) {
			System.out.println(p);
		}

	}
}
