import java.io.*;

public class CompareProductDetails {
	private long id;
	private String productName;
	private String supplierName;

	public CompareProductDetails() {

	}

	public CompareProductDetails(long id, String productName, String supplierName) {
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

	public boolean equals(Object obj) {
		boolean equalFlag = false;
		if (obj != null) {
			CompareProductDetails compare = (CompareProductDetails) obj;
			if (this.id == compare.id && productName.equals(compare.productName)
					&& supplierName.equals(compare.supplierName)) {
				System.out.println();
				equalFlag = true;
			}
		}
		return equalFlag;
	}
}
