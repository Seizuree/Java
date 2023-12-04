package builder;

import model.BeefSteak;
import model.Steak;

public class BeefSteakBuilder extends SteakBuilder {

	@Override
	public Steak create() {
		return new BeefSteak(name, sauce, price);
	}

}
