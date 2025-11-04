package com.mycompany.vending_machine;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		String emailUser;
		String passwordUser;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to our system - IKEA\n");
		System.out.println("Insert your credentials to access the system\n");
		System.out.println("E-mail: ");
		emailUser = userInput.nextLine();
		System.out.println("\nPassword:" );
		passwordUser = userInput.nextLine();
		SystemMachine systemVending_Machine = new SystemMachine();
		if (systemVending_Machine.login(emailUser, passwordUser) == true)
		{
			System.out.println("Access granted");
			systemVending_Machine.AccessSystem();
		}else {
			System.out.println("Access denied");
		}
		
	}
}
