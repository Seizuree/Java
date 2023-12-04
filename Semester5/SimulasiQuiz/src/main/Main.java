package main;

import java.util.ArrayList;
import java.util.Scanner;

import adapter.DessertToSteakAdapter;
import builder.BeefSteakBuilder;
import builder.SteakBuilder;
import database.Database;
import factory.ChickenSteakFactory;
import factory.SteakFactory;
import model.Dessert;
import model.Steak;

public class Main {

	Scanner sc = new Scanner(System.in);
	
	public Main() {		
		int input;
		
		while(true) {
			System.out.println("DC SteakHouse");
			System.out.println("=============");
			System.out.println("1. Add Menu");
			System.out.println("2. View Orders");
			System.out.println("3. Copy Steak Menu");
			System.out.println("4. Delete Menu");
			System.out.println("5. Exit");
			
			input = sc.nextInt();
			sc.nextLine();
			
			if(input == 1) {
				addOrderMenu();
			}else if(input == 2) {
				viewOrderMenu();
			}else if(input == 3) {
				copySteak();
			}else if(input == 4) {
				deleteOrderMenu();
			}else {
				break;
			}
		}

	}
	
	private void copySteak() {
		// TODO Auto-generated method stub
		Database db = Database.getInstance();
		System.out.println("Input steak name to be copied: ");
		String name = sc.nextLine();
		
		Steak newSteak = null;
		
		for(int i = 0; i < db.data.size(); i++) {
			if(db.data.get(i).name.equals(name)) {
				newSteak = db.data.get(i).Clone();
				break;
			}
		}
		
		if(newSteak == null) {
			return;
		}
		
		db.data.add(newSteak);
	}

	private void addOrderMenu() {
		// TODO Auto-generated method stub
		String type;
		
		System.out.println("Input menu type");
		type = sc.nextLine();
		
		String name = "Fillet Mignon";
		String sauce = "-";
		ArrayList<String> toppings = new ArrayList<>();
		if(type.equals("Chicken") || type.equals("Beef")) {
			sauce = "Truffle";			
		}else {
			toppings.add("Chocolate");
			toppings.add("Strawberry");
//			input 2 topping
		}
		
		double price = 55.5;
		
		Steak createdSteak = null;
		SteakFactory fact;
		SteakBuilder builder;
		
		if(type.equals("Beef")) {
//			ini cara biasa
//			--------------
//			createdSteak = new BeefSteak(name, sauce, price);
			
//			ini kalo pake cara factory
//			------------------------------
//			fact = new BeefSteakFactory();
//			createdSteak = fact.create(name, sauce, price);
			
//			ini klao pake builder
//			---------------------
			builder = new BeefSteakBuilder();
			createdSteak = builder.setName(name)
					.setPrice(price)
					.setSauce(sauce)
					.create();
		}else if(type.equals("Chicken")) {
			fact = new ChickenSteakFactory();
			createdSteak = fact.create(name, sauce, price);
		}else {
//			Dessert
//			nanti pake adapter
			Dessert createdDessert = new Dessert(sauce, toppings, price);
			createdSteak = new DessertToSteakAdapter(createdDessert);
		}
		
		Database db = Database.getInstance();
		db.data.add(createdSteak);
		
	}

	public void viewOrderMenu() {
		Database db = Database.getInstance();
		for(int i = 0; i < db.data.size(); i++) {
			db.data.get(i).printDetails();		
		}
	}
	
	public void deleteOrderMenu() {
		Database db = Database.getInstance();
//		input menu name to be deleted
		String name = sc.nextLine();
		for(int i = 0; i < db.data.size(); i++) {
			if(db.data.get(i).name == name) {
				db.data.remove(i);
				break;
			}			
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
