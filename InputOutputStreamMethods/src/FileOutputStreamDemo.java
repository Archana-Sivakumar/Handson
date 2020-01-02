import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		;
		FileOutputStream fileOutput = null;
		System.out.println("enter name:");
		String name = s.next();
		try {
			fileOutput = new FileOutputStream("D:/java codes/newFile.txt");
			byte buffer[] = new byte[100];
			buffer = name.getBytes();
			fileOutput.write(buffer);
			System.out.println("Employee details written successfully in the file");
		} catch (FileNotFoundException fileNotFound) {
			fileNotFound.printStackTrace();
		} catch (IOException ioexp) {
			ioexp.printStackTrace();
		} finally {
			try {
				fileOutput.close();
			} catch (IOException ioexp) {
				ioexp.printStackTrace();
			}

		}
	}
}
