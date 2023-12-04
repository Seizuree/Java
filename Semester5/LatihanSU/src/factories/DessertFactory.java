package factories;

import models.Dessert;
import models.Food;

public class DessertFactory extends FoodFactory {

  @Override
  public Food createFood(String name, int price, String type, String additional) {
    return new Dessert(name, price, type, additional);
  }
  
}
