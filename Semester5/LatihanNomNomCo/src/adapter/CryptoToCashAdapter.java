package adapter;

import model.Cash;
import model.Crypto;

public class CryptoToCashAdapter extends Cash {
	Crypto adaptee;

	public CryptoToCashAdapter(Crypto adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return adaptee.getPrice()/2;
	}
	
	
}
