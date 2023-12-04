package model;

import java.util.ArrayList;

public class Confectionary {
	private String type;
	private String name;
	private String softness;
	private double price;
	private String payment;
	private ArrayList<String> topping;
	
	public Confectionary(String type, String name, String softness, double price, String payment,
			ArrayList<String> topping) {
		super();
		this.type = type;
		this.name = name;
		this.softness = softness;
		this.price = price;
		this.payment = payment;
		this.topping = topping;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSoftness() {
		return softness;
	}
	
	public void setSoftness(String softness) {
		this.softness = softness;
	}
	
	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public ArrayList<String> getTopping() {
		return topping;
	}

	public void setTopping(ArrayList<String> topping) {
		this.topping = topping;
	}
}
