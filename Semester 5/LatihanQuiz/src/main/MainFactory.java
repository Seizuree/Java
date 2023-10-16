package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import adapter.CryptoToCash;
import adapter.TransferToCash;
import database.Database;
import factories.ConfectionaryFactory;
import factories.CupcakeFactory;
import factories.TartFactory;
import model.Confectionary;
import payment.Crypto;
import payment.Transfer;

public class MainFactory {
	Scanner sc = new Scanner(System.in);
	Database db = Database.getInstance();
	Random rand = new Random();

	long RandomNumber10digits() {
		long min = 1000000000L;
		long max = 9999999999L;
		return min + rand.nextLong() % (max - min + 1);
	}

	MainFactory() {
		MainMenu();
	}

	public static void main(String[] args) {
		new MainFactory();
	}

	void firstOpt() {
		String type;
		String name;
		String softness;
		String addTopping;
		double price;
		String paymentMethod;
		ArrayList<String> topping = new ArrayList<>();

		do {
			System.out.println("Input confectionary type [Cupcake | Tart][case sensitive]: ");
			type = sc.nextLine();
		} while (!(type.equals("Cupcake") || type.equals("Tart")));

		do {
			System.out.println("Input confectionary name [length between 5 - 15]: ");
			name = sc.nextLine();
		} while (name.length() < 5 || name.length() > 15);

		do {
			System.out.println("Input confectionary softness [Fluffy | Medium | Hard][case sensitive]: ");
			softness = sc.nextLine();
		} while (!(softness.equals("Fluffy") || softness.equals("Medium") || softness.equals("Hard")));

		do {
			System.out.println("Adding additional topping [Y | N][case sensitive]: ");
			addTopping = sc.nextLine();
		} while (!(addTopping.equals("Y") || addTopping.equals("N")));

		if (addTopping.equals("Y")) {
			for (int i = 1; i <= 3; i++) {
				String currTopping;
				do {
					System.out.println("Input topping " + i + "[length between 1 - 10]: ");
					currTopping = sc.nextLine();
				} while (currTopping.length() < 1 || currTopping.length() > 10);
				topping.add(currTopping);
			}
		}

		do {
			System.out.println("Input confectionary price [10.0 - 50.0]: ");
			price = sc.nextFloat();
			sc.nextLine();
		} while (price < 10.0 || price > 50.0);

		do {
			System.out.println("What kind of payment [Cash | Transfer | Crypto][case sensitive]: ");
			paymentMethod = sc.nextLine();
		} while (!(paymentMethod.equals("Cash") || paymentMethod.equals("Transfer") || paymentMethod.equals("Crypto")));

		if (paymentMethod.equals("Transfer")) {
			TransferToCash transferAdapter = new TransferToCash(new Transfer(price));
			price = transferAdapter.getPrice();
		} else if (paymentMethod.equals("Crypto")) {
			CryptoToCash cryptoAdapter = new CryptoToCash(new Crypto(price));
			price = cryptoAdapter.getPrice();
		}

		ConfectionaryFactory cf = null;

		if (type.equals("Cupcake")) {
			cf = new CupcakeFactory();
		} else if (type.equals("Tart")) {
			cf = new TartFactory();
		}

		Confectionary newConfectionary = cf.createConfectionary(type, name, softness, price, paymentMethod, topping);
		db.getConfectionary().add(newConfectionary);

		System.out.println("Confectionary baked!");
		System.out.println("Press enter to continue...");
		sc.nextLine();
		MainMenu();
	}

	void secondOpt() {
		ArrayList<Confectionary> data = db.getConfectionary();

		if (data.isEmpty()) {
			System.out.println("No Confectionary Yet...");
			System.out.println("Press enter to continue...");
		} else {
			for (Confectionary x : data) {
				System.out.printf("Name      : %s (%s)\n", x.getName(), x.getType());
				System.out.println("Softness  : " + x.getSoftness());
				if (x.getTopping() == null) {
					System.out.println("Topping  : -");
				}
				System.out.print("Topping   : ");
				ArrayList<String> topping = x.getTopping();
				for (String y : topping) {
					System.out.printf("%s ", y);
				}
				System.out.println();
				if (x.getPayment().equals("Cash")) {
					System.out.printf("Price     : $%.2f", x.getPrice());
				} else if (x.getPayment().equals("Transfer")) {
					System.out.printf(
							"Price     : $%.2f with Account Number : %.2d\n", x.getPrice(), RandomNumber10digits());
				} else if (x.getPayment().equals("Crypto")) {
					System.out.printf("Price     : $%.2f with Address : ", x.getPrice());
				}
				System.out.println("===========================");
			}
		}
	}

	void MainMenu() {
		int choices;
		System.out.println("Nom Nom Co.");
		System.out.println("===========");
		System.out.println("1. Bake Confectionary");
		System.out.println("2. View Confectionary Order");
		System.out.println("3. Exit");
		System.out.println(">>");
		do {
			choices = sc.nextInt();
			sc.nextLine();
		} while (choices < 1 || choices > 3);

		if (choices == 1) {
			firstOpt();
		}

		else if (choices == 2) {
			secondOpt();
		}

		else if (choices == 3) {
			System.out.println("Thank you for using my service!");
			System.exit(200);
		}
	}
}