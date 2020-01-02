import java.io.FileReader;
import java.util.Scanner;

public class SimpleFileRead {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the file name");
		String path = s.nextLine();
		FileReader fr = new FileReader(path);
		int i;
		while ((i = fr.read()) != -1)
			System.out.print((char) i);
		fr.close();

	}

}
