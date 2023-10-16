package adapter;

import model.Cash;
import model.Transfer;

public class TransferToCashAdapter extends Cash {
	
	Transfer adaptee;

	public TransferToCashAdapter(Transfer adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return adaptee.getPrice()*1.1;
	}
	
	
	
	

}
