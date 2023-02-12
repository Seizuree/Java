import java.util.Random;
import java.util.Scanner;

public class TestBentuk extends Thread {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    @Override
    public synchronized void run() {
        while (true) {
            if (Thread.currentThread().getName().equals("Thread 1")) {
                try {
                    while (App.state != 1) {
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                }
                System.out.printf("%s : Masukkan menu [0=Exit; 1=Segiempat; 2=Lingkaran]: ",
                        Thread.currentThread().getName());
                do {
                    App.menu = sc.nextInt();
                } while (App.menu < 0 || App.menu > 2);
                sc.nextLine();

                App.state = 2;
            } else if (Thread.currentThread().getName().equals("Thread 2")) {
                try {
                    while (App.state != 2) {
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                }
                int acak = rand.nextInt(99) + 1;
                if (App.menu == 1) {
                    System.out.printf("%s : Berapa luas dan keliling segiempat dengan sisi %d?\n",
                            Thread.currentThread().getName(), acak);
                    App.shape = new SegiEmpat();
                    SegiEmpat x = (SegiEmpat) App.shape;
                    x.setSisi(acak);
                } else if (App.menu == 2) {
                    System.out.printf("%s: Berapa luas dan keliling lingkaran dengan radius %d?\n",
                            Thread.currentThread().getName(), acak);
                    App.shape = new Lingkaran();
                    Lingkaran y = (Lingkaran) App.shape;
                    y.setRadius(acak);
                } else {
                    System.out.println("Exit");
                    System.exit(0);
                }
                App.state = 3;
            } else {
                try {
                    while (App.state != 3) {
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                }
                if (App.shape instanceof SegiEmpat || App.shape instanceof Lingkaran) {
                    System.out.printf("%s: Luas =%.2f dan keliling=%.2f\n", Thread.currentThread().getName(),
                            App.shape.hitungLuas(), App.shape.hitungKeliling());
                }
                App.state = 1;
            }
        }
    }
}
