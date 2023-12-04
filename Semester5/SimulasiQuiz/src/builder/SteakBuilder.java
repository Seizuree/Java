package builder;

import model.Steak;

public abstract class SteakBuilder {
	protected String name;
	protected String sauce;
	protected double price;
	
	public abstract Steak create();
	
	public SteakBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public SteakBuilder setSauce(String sauce) {
		this.sauce = sauce;
		return this;
	}
	public SteakBuilder setPrice(double price) {
		this.price = price;
		return this;
	}	
}
