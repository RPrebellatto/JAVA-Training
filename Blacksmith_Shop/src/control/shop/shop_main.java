package control.shop;

import java.util.Scanner;

import blacksmith.Blacksmith;
import blacksmith.BlacksmithList;

public class shop_main {
	static BlacksmithList b = new BlacksmithList();
	public static void main(String[] args) {
	
		init();
		
	}
	
	static void init() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome!");
		System.out.println("Are you a customer or a blacksmith?");
		System.out.println("1- Customer");
		System.out.println("2- Blacksmith");
		System.out.println("0- Sair");
		
		int option = userInput.nextInt();
		
			switch (option) {
				case 0: System.out.println("Thank you!");
				break;
				case 1: System.out.println("Teste");
				break;
				case 2: blacksmithSession();
				break;
				default: System.out.println("Invalid option");
				init();
				break;
			}
		userInput.close();
	}
	
	static void customerSession() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Dear Customer, which itens would you like to see?");
		System.out.println("1- Weapons");
		System.out.println("2- Armors");
		System.out.println("0- Sair");
		
		int option = userInput.nextInt();
		
		while(option < 0 || option > 2) {
			switch (option) {
				case 0: System.out.println("Thank you!");
				break;
				case 1: System.out.println();
				break;
				case 2: System.out.println();
				break;
				default: System.out.println("Invalid option");
				break;
			}
		}			
		userInput.close();
	}
	static void blacksmithSession() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Dear partner, what do you need from us today?");
		System.out.println("1- Add equipment");
		System.out.println("2- Withdraw equipment");
		System.out.println("3- Wallet");
		System.out.println("4- Sign up");
		System.out.println("0- Sair");
		
		int option = userInput.nextInt();
		
		while(option < 0 || option > 3) {
			switch (option) {
				case 0: System.out.println("Thank you!");
				break;
				case 1: System.out.println();
				break;
				case 2: System.out.println();
				break;
				case 3: System.out.println();
				break;
				case 4: signUp();
				break;
				default: System.out.println("Invalid option");
				break;
			}
		}
		userInput.close();
	}
	static void signUp() {
	Scanner userInput = new Scanner(System.in);
		System.out.println("What is your professional name?");
		String nameEntry = userInput.next();
		System.out.println(nameEntry);
		if (nameEntry == null) {
			userInput.close();
			System.out.println("Name was not informed");
			signUp();
		}
		else {
			b.blacksmiths.add(new Blacksmith(nameEntry));		
			userInput.close();
			System.out.println("Thank you for joining");
			blacksmithSession();
		}
	}
	
}
