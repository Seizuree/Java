package model;

import java.util.ArrayList;

public class Confectionary {	
	protected String type, name, softness;
	protected ArrayList<String> toppings;
	protected double price;
	
	public Confectionary() {}
	
	public Confectionary(String type, String name, String softness, ArrayList<String> toppings, double price) {
		super();
		this.type = type;
		this.name = name;
		this.softness = softness;
		this.toppings = toppings;
		this.price = price;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}

	public String getSoftness() {
		return softness;
	}

	public ArrayList<String> getToppings() {
		return toppings;
	}

	public double getPrice() {
		return price;
	}
	
}
