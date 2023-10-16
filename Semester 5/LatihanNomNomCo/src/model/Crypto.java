package model;

public class Crypto extends Payment{

	private double price;
	
	public Crypto(double price) {
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
