package factory2;

import model2.BeefSteak;
import model2.ChickenSteak;
import model2.FriedBeefSteak;
import model2.FriedChickenSteak;

public class FriedFactory extends SteakFactory {

	@Override
	public BeefSteak createBeef(String name, String sauce, double price) {
		// TODO Auto-generated method stub
		BeefSteak createdSteak = new FriedBeefSteak(name, sauce, price);
		return createdSteak;
	}

	@Override
	public ChickenSteak createChicken(String name, String sauce, double price) {
		// TODO Auto-generated method stub
		ChickenSteak createdSteak = new FriedChickenSteak(name, sauce, price);
		return createdSteak;
	}

}
