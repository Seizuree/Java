package factory;

import model.ChickenSteak;
import model.Steak;

public class ChickenSteakFactory extends SteakFactory {

	@Override
	public Steak create(String name, String sauce, double price) {
		Steak createdSteak = new ChickenSteak(name, sauce, price);
		return createdSteak;
	}

}
