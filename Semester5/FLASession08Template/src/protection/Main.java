package protection;

public class Main {

	public Main() {
		Database db = new Database();
		User admin = new User("Steven", "Admin");

		try {
			db.executeQuery("SELECT * FROM where");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}
