package factory;

import model.CottonPants;
import model.CottonShirt;
import model.Pants;
import model.Shirt;

public class CottonFactory implements AbstractFactory{

	@Override
	public Shirt createShirt() {
		// TODO Auto-generated method stub
		return new CottonShirt();
	}

	@Override
	public Pants createPants() {
		// TODO Auto-generated method stub
		return new CottonPants();
	}

}
