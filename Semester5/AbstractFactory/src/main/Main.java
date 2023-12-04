package main;

import factory.CottonFactory;
import factory.WoolFactory;
import store.FashionStore;

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		FashionStore cottonStore = new FashionStore(new CottonFactory());
		cottonStore.showAllProducts();
		
		FashionStore woolStore = new FashionStore(new WoolFactory());
		woolStore.showAllProducts();
	}
}
