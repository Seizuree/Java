package store;

import factory.AbstractFactory;
import model.Pants;
import model.Shirt;

public class FashionStore {
	AbstractFactory factory;
	Shirt shirt;
	Pants pants;
	public FashionStore(AbstractFactory factory) {
		super();
		this.factory = factory;
	}

	public void showAllProducts() {
		shirt = factory.createShirt();
		pants = factory.createPants();
		
		System.out.println(shirt.name);
		System.out.println(pants.name);
	}
}
