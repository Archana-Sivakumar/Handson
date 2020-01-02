import java.util.Scanner;

public class DisplayProductDetailsMain {

	public static void main(String[] args) {

		long newId;
		String newProductName;
		String newSupplierName;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the product id");
		newId = s.nextLong();

		System.out.println("Enter the product name");
		newProductName = s.next();

		System.out.println("Enter the supplier name");
		newSupplierName = s.next();

		DisplayProductDetails obj = new DisplayProductDetails(newId, newProductName, newSupplierName);
		obj.setId(newId);
		obj.setProductName(newProductName);
		obj.setSupplierName(newSupplierName);

		System.out.println(obj.toString());

		Class product = obj.getClass();

		System.out.println("Invoking getClass() mathod : class " + product.getName());
	}
}
