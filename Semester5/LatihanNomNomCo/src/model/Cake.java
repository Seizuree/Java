package model;

import java.util.ArrayList;

public abstract class Cake {

	private String name;
	private String softness;
	private ArrayList<String> toppings;
	private double price;
	private String payment;
	
	
	public Cake(String name, String softness, ArrayList<String> toppings, double price, String payment) {
		super();
		this.name = name;
		this.softness = softness;
		this.toppings = toppings;
		this.price = price;
		this.payment = payment;
	}


	//getter setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSoftness() {
		return softness;
	}


	public void setSoftness(String softness) {
		this.softness = softness;
	}


	public ArrayList<String> getToppings() {
		return toppings;
	}


	public void setToppings(ArrayList<String> toppings) {
		this.toppings = toppings;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getPayment() {
		return payment;
	}


	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	
	
	
	
}
