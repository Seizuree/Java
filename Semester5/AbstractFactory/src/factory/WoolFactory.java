package factory;

import model.Pants;
import model.Shirt;
import model.WoolPants;
import model.WoolShirt;

public class WoolFactory implements AbstractFactory {

	@Override
	public Shirt createShirt() {
		// TODO Auto-generated method stub
		return new WoolShirt();
	}

	@Override
	public Pants createPants() {
		// TODO Auto-generated method stub
		return new WoolPants();
	}

}
