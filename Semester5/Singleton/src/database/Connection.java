package database;

public class Connection {
    private static volatile Connection instance;

    private Connection() {
        System.out.println("Connected!");
    }

    public static Connection getInstance() {
        if (instance == null) {
            synchronized (Connection.class) {
                if (instance == null)
                    instance = new Connection();
            }
        }
        System.out.println("Getting connection!");
        return instance;
    }
}
