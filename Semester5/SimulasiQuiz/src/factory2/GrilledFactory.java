package factory2;

import model2.BeefSteak;
import model2.ChickenSteak;
import model2.GrilledBeefSteak;
import model2.GrilledChickenSteak;

public class GrilledFactory extends SteakFactory {

	@Override
	public BeefSteak createBeef(String name, String sauce, double price) {
		// TODO Auto-generated method stub
		BeefSteak createdSteak = new GrilledBeefSteak(name, sauce, price);
		return createdSteak;
	}

	@Override
	public ChickenSteak createChicken(String name, String sauce, double price) {
		// TODO Auto-generated method stub
		ChickenSteak createdSteak = new GrilledChickenSteak(name, sauce, price);
		return createdSteak;
	}

}
