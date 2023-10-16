package builder;

import model.ChickenSteak;
import model.Steak;

public class ChickenSteakBuilder extends SteakBuilder {

	@Override
	public Steak create() {
		return new ChickenSteak(name, sauce, price);
	}

}
