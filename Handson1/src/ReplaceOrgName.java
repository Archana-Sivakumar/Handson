import java.util.Scanner;

public class ReplaceOrgName {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the content of the document");
		String content = s.nextLine();

		System.out.println("Enter the old name of the company");
		String oldCompanyName = s.nextLine();

		System.out.println("Enter the new name of the company");
		String newCompanyName = s.nextLine();

		content = content.replace(oldCompanyName, newCompanyName);
		System.out.println("The content of the modified document is");
		System.out.println(content);
	}
}
