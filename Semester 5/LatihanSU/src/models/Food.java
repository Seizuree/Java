package models;

public class Food {
	private String name;
	private int price;
	private String type;
	private String additional;

	public Food(String name, int price, String type, String additional) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.additional = additional;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAdditional() {
		return this.additional;
	}

	public void setAdditional(String additional) {
		this.additional = additional;
	}
}
