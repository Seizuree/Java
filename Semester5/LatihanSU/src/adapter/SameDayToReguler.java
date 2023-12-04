package adapter;

import delivery.RegularDelivery;
import delivery.SameDayDelivery;

public class SameDayToReguler extends RegularDelivery{
	private SameDayDelivery sameDay;
	
	public SameDayToReguler(SameDayDelivery sameDay) {
		this.sameDay = sameDay;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return sameDay.getPrice() + 15000;
	}
	
	
}
