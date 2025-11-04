package com.mycompany.vending_machine;

public class ProductSalesReport {
	private int productId;
	private int salesProduct;
	
	public ProductSalesReport(int productId, int salesProduct) {
		this.productId = productId;
		this.salesProduct = salesProduct;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getSalesProduct() {
		return salesProduct;
	}
	public void setSalesProduct(int salesProduct) {
		this.salesProduct = salesProduct;
	}

}
