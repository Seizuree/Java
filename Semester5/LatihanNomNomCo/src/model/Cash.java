package model;

public class Cash extends Payment{

	private double price;
	
	public Cash(double price) {
		super(price);
		this.price = price;
		// TODO Auto-generated constructor stub
	}
	
	public Cash() {}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

}
