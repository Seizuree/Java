package main;

import builders.BaconBurgerBuilder;
import builders.CheeseBurgerBuilder;
import builders.Director;
import models.BaconBurger;
import models.CheeseBurger;

public class Main {
	
	public Main() {
		BaconBurgerBuilder baconBuilder = new BaconBurgerBuilder();
		CheeseBurgerBuilder cheeseBuilder = new CheeseBurgerBuilder();
		Director d = new Director(baconBuilder);
		d.create();
		
		BaconBurger bacon = (BaconBurger) baconBuilder.getBurger();
		
		d.ChangeBuilder(cheeseBuilder);
		d.create();
		CheeseBurger cheese = (CheeseBurger) cheeseBuilder.getBurger();
		
//		BaconBurger bacon = (BaconBurger) baconBuilder.addBun("Handi").addExtra("Desu").addPatty("Su").addSauce("Handi").getBurger();
//		BaconBurger bacon2 = (BaconBurger) baconBuilder.reset().addBun("Wheat").getBurger();
//		
//		CheeseBurger cheese = (CheeseBurger) cheeseBuilder.addBun("Wheat").getBurger();
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
