package factories;

import models.Food;

public abstract class FoodFactory {
  public abstract Food createFood(String name, int price, String type, String additional);
}
