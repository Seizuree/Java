package model;

public class Transfer extends Payment{

	private double price;
	
	public Transfer(double price) {
		super(price);
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
}
