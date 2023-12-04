package adapter;

import payment.Cash;
import payment.Crypto;

public class CryptoToCash extends Cash {

	private Crypto crypto;

	public CryptoToCash(Crypto crypto) {
		this.crypto = crypto;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return crypto.getPrice() / 2;
	}
}
