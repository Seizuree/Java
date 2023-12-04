package factory;

import java.util.ArrayList;

import model.Cake;
import model.Cupcake;

public class CupcakeFactory extends CakeFactory{

	@Override
	public Cake createCake(String name, String softness, ArrayList<String> toppings, double price, String paymentType) {
		// TODO Auto-generated method stub
		return new Cupcake(name, softness, toppings, price, paymentType);
	}

	
	

}
