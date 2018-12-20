package com.retail.task;

public class Product 
{
	private String Id;
	private String ProductName;
	private String ProductType;
	private String ProductPrice;
	private String ProductBarcodeNumber;

	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductType() {
		return ProductType;
	}
	public void setProductType(String productType) {
		ProductType = productType;
	}
	public String getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(String productPrice) {
		ProductPrice = productPrice;
	}
	public String getProductBarcodeNumber() {
		return ProductBarcodeNumber;
	}
	public void setProductBarcodeNumber(String productBarcodeNumber) {
		ProductBarcodeNumber = productBarcodeNumber;
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", ProductName=" + ProductName + ", ProductType=" + ProductType + ", ProductPrice="
				+ ProductPrice + ", ProductBarcodeNumber=" + ProductBarcodeNumber + "]";
	}
}
