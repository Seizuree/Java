package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Thread1 implements Runnable {
  DDL fakeData = new DDL();

  @Override
  public void run() {
    String url = "jdbc:mysql://localhost:3306/javamt";
    String username = "root";
    String password = "";

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = DriverManager.getConnection(url, username, password);
      String currThread = Thread.currentThread().getName();
      String query = "INSERT INTO `tbl_data` VALUES (?, ?, ?, ?, ?, ?)";
      try (PreparedStatement statement = conn.prepareStatement(query)){
        statement.setString(0, currThread);
        statement.setString(1, fakeData.datetime);
        statement.setString(3, fakeData.name);
        statement.setString(4, fakeData.birthdayFormatted);
        statement.setInt(5, fakeData.isStudent);
      } catch (Exception e) {
        System.out.println("Error in " + e.getMessage());
      }
      conn.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
