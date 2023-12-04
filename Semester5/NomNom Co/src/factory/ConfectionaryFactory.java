package factory;

import java.util.ArrayList;

import model.Confectionary;

public class ConfectionaryFactory {
	public Confectionary createConfectionary(String type, String name, String softness, ArrayList<String> toppings,
			double price) {
		return new Confectionary(type, name, softness, toppings, price);
	}
}
