public class App {
    public static void main(String[] args) throws Exception {
        new App();
    }

    App() {
        Thread1 thread = new Thread1();
        thread.run();
    }
}
