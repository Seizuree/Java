public class App {
  public static void main(String[] args) throws Exception {
    new App();
  }

  public static int menu = -1;
  public static int state = 1;
  public static Bentuk shape;

  App() {
    Thread t1 = new TestBentuk();
    t1.setName("Thread 1");
    Thread t2 = new TestBentuk();
    t2.setName("Thread 2");
    Thread t3 = new TestBentuk();
    t3.setName("Thread 3");
    t1.start();
    t2.start();
    t3.start();
  }
}