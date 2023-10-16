package factories;

import models.Food;
import models.MainCourse;

public class MainCourseFactory extends FoodFactory {
  @Override
  public Food createFood(String name, int price, String type, String additional) {
    return new MainCourse(name, price, type, additional);
  }
}
