
public class ProductDetailsConstructor {
	private long id;
	private String productName;
	private String supplierName;

	public ProductDetailsConstructor(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}

	public long getId() {
		return this.id;
	}

	public String getProductName() {
		return this.productName;
	}

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	void display(long id, String productName, String supplierName) {
		System.out.println("Product Id is " + id);
		System.out.println("Product Name is " + productName);
		System.out.println("Supplier Name is " + supplierName);
	}
}
