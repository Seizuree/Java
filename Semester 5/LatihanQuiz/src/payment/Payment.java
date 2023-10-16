package payment;

public abstract class Payment {

	private double price;

	public Payment(double price) {
		super();
		this.price = price;
	}
	
	public Payment() {}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
