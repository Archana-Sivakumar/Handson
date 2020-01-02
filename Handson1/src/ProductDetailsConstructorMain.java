import java.util.Scanner;

public class ProductDetailsConstructorMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the product id");
		long newId = s.nextLong();

		System.out.println("Enter the product name");
		String newProductName = s.next();

		System.out.println("Enter the supplier name");
		String newSupplierName = s.next();

		ProductDetailsConstructor obj = new ProductDetailsConstructor(newId, newProductName, newSupplierName);
		obj.setId(newId);
		obj.setProductName(newProductName);
		obj.setSupplierName(newSupplierName);
		obj.display(newId, newProductName, newSupplierName);

		ProductDetailsConstructorMain product = new ProductDetailsConstructorMain();
		long newId1 = obj.getId();
		String newProductName1 = obj.getProductName();
		String newSupplierName1 = obj.getSupplierName();
		product.display(newId, newProductName, newSupplierName);
	}

	void display(long newId1, String newProductName1, String newSupplierName1) {
		System.out.println("Product Id is " + newId1);
		System.out.println("Product Name is " + newProductName1);
		System.out.println("Supplier Name is " + newSupplierName1);
	}
}
