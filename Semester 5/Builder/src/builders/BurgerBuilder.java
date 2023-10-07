package builders;

import models.Burger;

public interface BurgerBuilder {
	BurgerBuilder reset();
	BurgerBuilder addBun(String bun);
	BurgerBuilder addPatty(String patty);
	BurgerBuilder addSauce(String sauce);
	BurgerBuilder addExtra(String extra);
	Burger getBurger();
}
