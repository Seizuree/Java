package factory;

import model.BeefSteak;
import model.Steak;

public class BeefSteakFactory extends SteakFactory {

	@Override
	public Steak create(String name, String sauce, double price) {
		Steak createdSteak = new BeefSteak(name, sauce, price);
		return createdSteak;
	}

}
