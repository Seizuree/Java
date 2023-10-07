package factory;

import model.Pants;
import model.Shirt;

public interface AbstractFactory {
	public Shirt createShirt();
	public Pants createPants();
}
