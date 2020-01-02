import java.util.Scanner;

public class ProductDetailsMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the product id");
		long id = s.nextLong();

		System.out.println("Enter the product name");
		String productName = s.next();

		System.out.println("Enter the supplier name");
		String supplierName = s.next();

		ProductDetails obj = new ProductDetails();
		obj.setId(id);
		obj.setProductName(productName);
		obj.setSupplierName(supplierName);

		System.out.println("Product Id is " + obj.getId());
		System.out.println("Product Name is " + obj.getProductName());
		System.out.println("Supplier Name is " + obj.getSupplierName());
	}
}
