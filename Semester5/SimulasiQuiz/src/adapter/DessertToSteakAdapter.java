package adapter;

import model.Dessert;
import model.Steak;

public class DessertToSteakAdapter extends Steak {
	public Dessert dessert; // -> adaptee (poinnya gede)

	public DessertToSteakAdapter(Dessert dessert) {
		super();
		this.dessert = dessert;
		this.name = dessert.name;
		this.price = dessert.price;
	}

	@Override
	public void printDetails() {
		System.out.println("Name      : " + dessert.name);
		System.out.print("Topping   : ");
		if (dessert.toppings.size() == 0) {
			System.out.println("-");
		} else {
			for (String topping : dessert.toppings) {
				System.out.println(topping);
			}
		}
		System.out.println();
		System.out.println("Price     : " + dessert.price);
	}
}
