import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Thread1 implements Runnable {
  String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
  String time = new SimpleDateFormat("HH.mm.ss").format(Calendar.getInstance().getTime());
  String datetime = String.format("%sT%s.000Z", date, time);

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
        statement.setString(1, datetime);
        statement.setString(3, name);
        statement.setString(4, birthdate);
        statement.setInt(5, isstudent);
      } catch (Exception e) {
        System.out.println("Error in " + e.getMessage());
      }
      conn.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
