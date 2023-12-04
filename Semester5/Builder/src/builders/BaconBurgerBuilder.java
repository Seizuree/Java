package builders;

import models.BaconBurger;
import models.Burger;

public class BaconBurgerBuilder implements BurgerBuilder {

	private BaconBurger burger;
	
	public BaconBurgerBuilder() {
		this.burger = new BaconBurger();
	}

	@Override
	public BurgerBuilder reset() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public BurgerBuilder addBun(String bun) {
		burger.setBun(bun);
		return this;
	}

	@Override
	public BurgerBuilder addPatty(String patty) {
		burger.setPatty(patty);
		return this;
	}

	@Override
	public BurgerBuilder addSauce(String sauce) {
		burger.setSauce(sauce);
		return this;
	}

	@Override
	public BurgerBuilder addExtra(String extra) {
		burger.setBacon(extra);
		return this;
	}

	@Override
	public Burger getBurger() {
		// TODO Auto-generated method stub
		return burger;
	}

}
