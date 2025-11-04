package com.mycompany.vending_machine;

import java.util.ArrayList;

public class Sales {
		public ArrayList<Product> products;
		private ArrayList<ProductSalesReport> salesReport;
		
		public Sales()
		{
			products = new ArrayList<>();
			salesReport = new ArrayList<>();
		}
		
		public void createProduct(Product newProduct)
		{
			products.add(newProduct);
		}
		
		public void listProducts()
		{
			if (products.isEmpty())
			{
				System.out.println("Products not registered\n");
			}else {
				for (Product product : products)				{
					System.out.println("\nID: " + product.getProductId() + "\nName: " + product.getProductName() + "\nDescription: " + product.getProductDescription() 
					+ "\nPrice: " + product.getProductPrice() + "\nStock: " + product.getProductStock() + "\n");
				}
			}
		}
		
		public boolean sellProduct(int productId, int quantity)
		{
			for (Product product : products)
			{
				if (product.getProductId() == productId)
				{
					product.setProductStock(product.getProductStock() - quantity);
					salesReport.add(new ProductSalesReport(productId, quantity));
				}else {
					System.out.println("\nThis product has been not registered yet!");
				}
			}
			return false;
		}
		
		public int allSalesQuantity()
		{
			int allSalesReport = 0;
			for (ProductSalesReport report: salesReport)
			{
				allSalesReport += report.getSalesProduct();
			}
			return allSalesReport;
		}
		
		public void  allSalesPrice()
		{
			float allSalesReport = 0;
			for (Product product : products) {
				for (ProductSalesReport report: salesReport)
				{
					if (product.getProductId() == report.getProductId())
					{
						System.out.println("Produto: " + product.getProductName() + " || Total vendido: " + report.getSalesProduct() * product.getProductPrice());
					} 
				}
				
			}
		}
		
		public void salesReport()
		{
			if (salesReport.isEmpty())
			{
				System.out.println("None sales do it for now");
			}else {
				for (ProductSalesReport report : salesReport)
				{
					System.out.println("\n Total de vendas: " + allSalesQuantity());
				}
			}
		}

}
