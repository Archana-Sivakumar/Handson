
public class DisplayProductDetails {
	private long id;
	private String productName;
	private String supplierName;

	public DisplayProductDetails() {

	}

	public DisplayProductDetails(long id, String productName, String supplierName) {
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

	public String toString() {
		return (id + ":" + productName + ":" + supplierName);
	}
}
