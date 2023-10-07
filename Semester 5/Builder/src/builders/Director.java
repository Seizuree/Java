package builders;

public class Director {

	BurgerBuilder builder;
	public Director(BurgerBuilder builder) {
		this.builder = builder;
	}

	public void ChangeBuilder(BurgerBuilder builder) {
		this.builder = builder;
	}
	
	public void create() {
		if (builder instanceof BaconBurgerBuilder) {
			this.builder.addBun("Wheat").addPatty("Chicken").addSauce("Mayo").addExtra("Bacon");
		} else {
			this.builder.addBun("Wheat").addPatty("Beef").addExtra("Cheese");
		}
	}
}
