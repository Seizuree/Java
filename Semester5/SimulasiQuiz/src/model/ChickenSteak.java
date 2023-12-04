package model;

public class ChickenSteak extends Steak {

	public ChickenSteak(String name, String sauce, double price) {
		this.name = name;
		this.sauce = sauce;
		this.price = price;
	}

	@Override
	public void printDetails() {
		System.out.println("Name    : " + this.name);
		System.out.println("Sauce   : " + this.sauce);
		System.out.println("Price   : " + this.price);
	}

}
