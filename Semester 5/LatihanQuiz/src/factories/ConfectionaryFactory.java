package factories;

import java.util.ArrayList;

import model.Confectionary;

public abstract class ConfectionaryFactory {
  public abstract Confectionary createConfectionary(String type, String name, String softness, double price, String payment, ArrayList<String> topping);
}
