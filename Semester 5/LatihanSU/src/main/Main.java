package main;

import java.util.Scanner;

import factories.AppetizerFactory;
import factories.DessertFactory;
import factories.FoodFactory;
import factories.MainCourseFactory;
import models.Food;

public class Main {
	Scanner sc = new Scanner(System.in);

	public Main() {
		int choices;
		do {
			System.out.println("SU Food Delivery");
			System.out.println("================");
			System.out.println("1. Insert new food");
			System.out.println("2. Deliver food");
			System.out.println("3. Exit");
			System.out.print(">> ");
			choices = sc.nextInt();
			sc.nextLine();
		} while (choices < 1 || choices > 3);
		
		if(choices == 1) {
			String name;
			int price;
			String type;
			String additional;
			
			do {
				System.out.println("Input food name [5-15]: ");
				name = sc.nextLine();
			} while (name.length() < 5 || name.length() > 15);
			
			do {
				System.out.println("Input food price [ >= 10000]: ");
				price = sc.nextInt();
				sc.nextLine();
			} while (price < 10000);
			
			do {
				System.out.println("Input food type [Appetizer | Main Course | Dessert]: ");
				type = sc.nextLine();
			} while (!(type.contains("Appetizer") || type.contains("Main Course") || type.contains("Dessert")));
			
			FoodFactory factory = null;
			
			if (type.contains("Appetizer")) {
				factory = new AppetizerFactory();
			}
			else if(type.contains("Main Course")) {
				factory = new MainCourseFactory();
			}
			else if(type.contains("Dessert")) {
				factory = new DessertFactory();
			}
			
			Food newFood = factory.createFood(name, price, additional)
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
