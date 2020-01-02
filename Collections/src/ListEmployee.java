import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListEmployee {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter id");
		String id = s.next();

		System.out.println("Enter name");
		String name = s.next();

		System.out.println("Enter department");
		String department = s.next();

		System.out.println("enter salary");
		String salary = s.next();

		Employee obj = new Employee();
		obj.setId(id);
		obj.setName(name);
		obj.setDepartment(department);
		obj.setSalary(salary);

		list.add(obj.getId());
		list.add(obj.getName());
		list.add(obj.getDepartment());
		list.add(obj.getSalary());

		System.out.println(list);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
