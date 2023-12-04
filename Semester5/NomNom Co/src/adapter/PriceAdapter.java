package adapter;

import model.Confectionary;

public class PriceAdapter extends Confectionary {
	private Confectionary adaptee;

	public PriceAdapter(Confectionary adaptee) {
		this.adaptee = adaptee;
	}

	public double getPrice(String paymentMethod) {
		if (paymentMethod.equals("Cash")) {
			return adaptee.getPrice();
		} else if (paymentMethod.equals("Transfer")) {
			return adaptee.getPrice() * 1.1;
		}
		return adaptee.getPrice() / 2;
	}
}
