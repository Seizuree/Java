package database;

import java.util.ArrayList;

import models.Food;

public class Database {
  private static Database db;
  private ArrayList<Food> food = null;

  private Database(){
    food = new ArrayList<Food>();
  }

  public static Database getInstance(){
    if (db == null) {
      db = new Database();
    }
    return db;
  }

  public ArrayList<Food> getList(){
    return food;
  }
}
