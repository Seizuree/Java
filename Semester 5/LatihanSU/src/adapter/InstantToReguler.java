package adapter;

import delivery.InstantDelivery;
import delivery.RegularDelivery;

public class InstantToReguler extends RegularDelivery {
	private InstantDelivery instant;

	public InstantToReguler(InstantDelivery instant) {
		this.instant = instant;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return instant.getPrice() + 20000;
	}
}
