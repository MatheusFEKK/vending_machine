package com.mycompany.vending_machine;
import java.util.Scanner;

public class SystemMachine {
	public String emailUser = "matheus@gmail.com";
	private String passwordUser = "23012006";
	public Sales systemSales;

	public boolean login(String emailUser, String passwordUser)
	{
		if (this.emailUser.equals(emailUser) && this.passwordUser.equals(passwordUser))
		{
			this.systemSales = new Sales();
			return true;
		}else {
			return false;
		}
	}
	
	public void AccessSystem() {
		Scanner userInput = new Scanner(System.in);
		int userOption = 0;
		int productId;
		int productStock;
		float productPrice;
		String productName;
		String productDescription;
		
		while (userOption != 7)
		{
			System.out.println("1 - List Products \n2 - Register a new Product \n3 - Sell a product \n4 - Sales Report \n7 - Exit from the System");
			userOption = userInput.nextInt();
			switch (userOption) {
			case 1:
				systemSales.listProducts();
				break;
			case 2:
				
				System.out.println("Insert the ID of the product: ");
				productId = userInput.nextInt();
				userInput.nextLine();
				System.out.println("Insert the Stock of the product: ");
				productStock = userInput.nextInt();
				userInput.nextLine();
				System.out.println("Insert the Price of the product: ");
				productPrice = userInput.nextFloat();
				userInput.nextLine();
				System.out.println("Insert the Name of the product: ");
				productName = userInput.nextLine();
				System.out.println("Insert the Description of the product: ");
				productDescription = userInput.nextLine();
				Product product = new Product(productId, productName, productDescription, productPrice, productStock);
				systemSales.createProduct(product);
				break;
			case 3:
				System.out.println("To make the sell please, insert the ID of the product:");
				productId = userInput.nextInt();
				System.out.println("Now the quantity that you going to sell");
				productStock = userInput.nextInt();
				systemSales.sellProduct(productId, productStock);
				break;
			case 4:
				systemSales.salesReport();
				systemSales.allSalesPrice();
				break;
			case 7:
				System.out.println("Exiting from the system!");
				break;
			default:
				System.out.println("\nThe option selected is no longer avaliable!");
				break;
			}
		}
	}
}
