package adapter;

import payment.Cash;
import payment.Transfer;

public class TransferToCash extends Cash{

	private Transfer transfer;

	public TransferToCash(Transfer transfer) {
		this.transfer = transfer;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return transfer.getPrice() * 1.1;
	}
}
