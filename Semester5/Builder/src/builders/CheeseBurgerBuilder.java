package builders;

import models.Burger;
import models.CheeseBurger;

public class CheeseBurgerBuilder implements BurgerBuilder{

	private CheeseBurger burger;
	
	public CheeseBurgerBuilder() {
		this.burger = new CheeseBurger();
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
		burger.setCheese(extra);
		return this;
	}

	@Override
	public Burger getBurger() {
		// TODO Auto-generated method stub
		return burger;
	}

}
