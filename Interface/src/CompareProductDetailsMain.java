import java.util.Scanner;

public class CompareProductDetailsMain {

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

		CompareProductDetails obj = new CompareProductDetails(newId, newProductName, newSupplierName);
		obj.setId(newId);
		obj.setProductName(newProductName);
		obj.setSupplierName(newSupplierName);

		long newId1 = obj.getId();
		String newProductName1 = obj.getProductName();
		String newSupplierName1 = obj.getSupplierName();
		CompareProductDetailsMain product = new CompareProductDetailsMain();

		product.display(newId1, newProductName1, newSupplierName1);

		System.out.println("Enter the product id");
		newId = s.nextLong();

		System.out.println("Enter the product name");
		newProductName = s.next();

		System.out.println("Enter the supplier name");
		newSupplierName = s.next();

		CompareProductDetails objOne = new CompareProductDetails(newId, newProductName, newSupplierName);
		objOne.setId(newId);
		objOne.setProductName(newProductName);
		objOne.setSupplierName(newSupplierName);

		long newId2 = objOne.getId();
		String newProductName2 = objOne.getProductName();
		String newSupplierName2 = objOne.getSupplierName();

		product.display(newId2, newProductName2, newSupplierName2);

		// if(obj.hashCode() == objOne.hashCode()) {
		boolean result = obj.equals(objOne);
		if (result == true) {
			System.out.println("The two products are same");
		} else {
			System.out.println("The two products are different");
		}
	}

	void display(long newId1, String newProductName1, String newSupplierName1) {
		System.out.println("Product Id is " + newId1);
		System.out.println("Product Name is " + newProductName1);
		System.out.println("Supplier Name is " + newSupplierName1);

	}
}
