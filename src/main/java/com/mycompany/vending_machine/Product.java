package com.mycompany.vending_machine;

public class Product {
	private int productId;
	public String productName;
	public String productDescription;
	public float productPrice;
	private int productStock;
	
	public Product(int productId, String productName, String productDescription, float productPrice, int productStock)
	{
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}
	
	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	
	public int getProductId()
	{
		return this.productId;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	public String getProductName()
	{
		return this.productName;
	}

}
