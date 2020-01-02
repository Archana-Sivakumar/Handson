package jdbcprograms;

import java.util.Scanner;

public class QueryDaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		QueryDao queryDao = new QueryDao();
		System.out.println("Enter the option");
		int option = scanner.nextInt();
		int rows = 0;
		
		if (option == 1) {
			System.out.println("Insert the data");
			System.out.println("******************");
			
			System.out.println("Enter id to insert");
			int insertId = scanner.nextInt();

			System.out.println("Enter name to insert");
			String newName = scanner.next();

			System.out.println("Enter age to insert");
			int insertAge = scanner.nextInt();

			System.out.println("Enter state to insert");
			String newState = scanner.next();

			rows = queryDao.insertMethod(insertId, newName, insertAge, newState);
			System.out.println(rows + " rows affected");
		}

		if (option == 2) {
			System.out.println("Delete the data");
			System.out.println("******************");
			
			System.out.println("Enter the id to delete");
			int newId = scanner.nextInt();
			rows = queryDao.deleteMethod(newId);
			System.out.println(rows + " rows affected");
		}

		if (option == 3) {
			System.out.println("Update the data");
			System.out.println("******************");
			
			System.out.println("Enter the id to update");
			int updateId = scanner.nextInt();
			System.out.println("Enter the age to update");
			int newAge = scanner.nextInt();
			rows = queryDao.updateMethod(updateId, newAge);
			System.out.println(rows + " rows affected");
		}

		if (option == 4) {
			System.out.println("Select the data");
			System.out.println("******************");
			queryDao.selectMethod();
			System.out.println("Selected successfully");
		}
	}

}
