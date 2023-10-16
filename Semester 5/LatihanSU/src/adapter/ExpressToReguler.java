package adapter;

import delivery.ExpressDelivery;
import delivery.RegularDelivery;

public class ExpressToReguler extends RegularDelivery{
	private ExpressDelivery express;

	public ExpressToReguler(ExpressDelivery express) {
		this.express = express;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return express.getPrice() + 10000;
	}
}
