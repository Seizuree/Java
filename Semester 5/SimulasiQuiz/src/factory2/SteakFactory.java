package factory2;

import model2.BeefSteak;
import model2.ChickenSteak;

public abstract class SteakFactory {

	public abstract BeefSteak createBeef(String name, String sauce, double price);
	public abstract ChickenSteak createChicken(String name, String sauce, double price);
	
}
