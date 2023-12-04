package factory;

import model.Steak;

public abstract class SteakFactory {
	public abstract Steak create(String name, String sauce, double price);
}
