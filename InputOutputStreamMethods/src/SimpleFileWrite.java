import java.io.FileWriter;
import java.util.Scanner;

public class SimpleFileWrite {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String name;
		String teamName;
		int noOfMatches;
		try {
			FileWriter filewrite = new FileWriter("D:\\java codes\\player.txt");
			System.out.println("Enter the name of the player");
			name = s.nextLine();

			System.out.println("Enter the team name");
			teamName = s.nextLine();

			System.out.println("Enter the number of matches played");
			noOfMatches = s.nextInt();

			filewrite.write(name + "," + teamName + "," + noOfMatches);
			filewrite.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
