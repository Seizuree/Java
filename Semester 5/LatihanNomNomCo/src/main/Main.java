package main;

import java.util.ArrayList;
import java.util.Scanner;

import adapter.CryptoToCashAdapter;
import adapter.TransferToCashAdapter;
import database.Database;
import factory.CakeFactory;
import factory.CupcakeFactory;
import factory.TartFactory;
import model.Cake;
import model.Crypto;
import model.Transfer;

public class Main {
	public Database dBase = Database.getInstance();
	
	public Scanner sc = new Scanner(System.in);
	
	
	public void inputBake() {
		
		String type;
		String name;
		String softness;
		String toppingYN;
		ArrayList<String> toppings = new ArrayList<String>();
		String tempTopping;
		double price;
		String paymentType;
		
		do {
			System.out.println("Input Type ( Cupcake / Tart ) Case Sensitive");
			type = sc.nextLine();
		} while(!(type.equals("Cupcake") || type.equals("Tart")));
		
		
		do {
			System.out.println("Input Name [Length between 5-15]");
			name = sc.nextLine();
		} while(name.length() < 5 || name.length() > 15);
		
		
		do {
			System.out.println("Input softness [Fluffy / Medium / Hard] case sensitive");
			softness = sc.nextLine();
			
		} while( !(softness.equals("Fluffy") || softness.equals("Medium") || softness.equals("Hard") ));
		
		
		do {
			System.out.println("Want to add additional topping? (Y / N) case sensitive");
			toppingYN = sc.nextLine();
			
		} while (!(toppingYN.equals("Y") || toppingYN.equals("N")));
		
		
		if(toppingYN.equals("Y")) {
			tempTopping = "";
			
			
			for(int i = 0; i < 3; i++) {
			
				do {
					System.out.println("Input topping " + i+1 + "length between 1 - 10" );
					tempTopping = sc.nextLine();
				
				} while (tempTopping.length() < 1 || tempTopping.length()> 10);
				
				toppings.add(tempTopping);
			
			}
			
			
		} 
		
		
		
		do {
			System.out.println("Input price : ");
			price = sc.nextDouble();
			
		} while(price < 10.0 || price > 50.0);
		
		
		do {
			System.out.println("What kind of payment? (Cash / Transfer / Crypto");
			paymentType = sc.nextLine();
			
		} while(!(paymentType.equals("Cash") || paymentType.equals("Transfer") || paymentType.equals("Crypto")));
		
		
		if (paymentType.equals("Transfer")) {
			TransferToCashAdapter adapterCash = new TransferToCashAdapter(new Transfer(price));
			price = adapterCash.getPrice();
			
		} else if (paymentType.equals("Crypto")) {
			CryptoToCashAdapter adapterCash = new CryptoToCashAdapter(new Crypto(price));
			price = adapterCash.getPrice();
			
		}
		
		CakeFactory cf = null;
		if(type.equals("Cupcake")) {
			cf = new CupcakeFactory();
		
		} else if (type.equals("Tart")) {
			cf = new TartFactory();	
		}
		
		Cake newCake = cf.createCake(name, softness, toppings, price, paymentType);
		dBase.getList().add(newCake);
		
		
	}
	
	
	public void viewCake() {
		
		if(dBase.getList().isEmpty() == true) {
			System.out.println("Empty");
		} else {
			
			for(Cake c : dBase.getList()) {
				System.out.println("Name : " + c.getName());
				System.out.println("Softness : " + c.getSoftness());
				System.out.println("Topping : " + c.getToppings());
				System.out.println("Payment Type : " + c.getPayment());
				System.out.println("Price: " + c.getPrice());
				
			}
			
		}
		
	}
	
	public Main() {
		// TODO Auto-generated constructor stub
		int opt = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Nom Nom Co");
			System.out.println("1. Bake Confectionary");
			System.out.println("2. View Confectionary Order");
			System.out.println("3. Exit");
			System.out.print(">>");
			opt = sc.nextInt();
			
			
			if(opt == 1) {
				//bake
				inputBake();
			} else if (opt == 2) {
				viewCake();
				//view
			} 
			
		} while(opt !=3);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
