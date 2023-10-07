package main;

import database.Connection;

public class App {
    public App() {
        Connection con1 = Connection.getInstance();        
        Connection con2 = Connection.getInstance();
    }

    public static void main(String[] args) throws Exception {
        new App();
    }
}
