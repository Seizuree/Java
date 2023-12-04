package factories;

import models.Appetizer;
import models.Food;

public class AppetizerFactory extends FoodFactory {
  @Override
  public Food createFood(String name, int price, String type, String additional) {
    return new Appetizer(name, price, type, additional);
  }
}
