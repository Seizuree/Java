package factory;

import java.util.ArrayList;

import model.Cake;

public abstract class CakeFactory {

	public abstract Cake createCake(String name, String softness, ArrayList<String> toppings, double price, String paymentType);
	
	
}
