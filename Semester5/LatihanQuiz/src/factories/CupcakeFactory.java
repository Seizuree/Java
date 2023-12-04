package factories;

import java.util.ArrayList;

import model.Confectionary;
import model.Cupcake;

public class CupcakeFactory extends ConfectionaryFactory {

	@Override
	public Confectionary createConfectionary(String type, String name, String softness, double price, String payment,
			ArrayList<String> topping) {
		// TODO Auto-generated method stub
		return new Cupcake(type, name, softness, price, payment, topping);
	}
	
}
