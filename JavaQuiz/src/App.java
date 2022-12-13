import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    ArrayList<Name> x = new ArrayList<Name>();
    ArrayList<Gaji> y = new ArrayList<Gaji>();
    int firstChoices = 0;
    int secondChoices = 0;
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        new App();
    }

    void inputPegawai(){
        for (int i = 1; i <= firstChoices; i++) {
            int gaji = 0;
            String nama; 
            do {
                System.out.printf("Masukkan nama pegawai %d [1-20 karakter]: ",i);
                nama = sc2.nextLine();
            } while (nama.length() < 1 || nama.length() > 20);
            do {
                System.out.printf("Masukkan gaji pegawai %d [300-500]: ",i);
                gaji = sc1.nextInt();
            } while (gaji < 300 || gaji > 500);
            x.add(new Name(nama));
            y.add(new Gaji(gaji));
        }
    }

    void printFunction(){
        System.out.println("Daftar Nama / Gaji Pegawai:");
        for (int i = 0; i < x.size(); i++) {
            System.out.printf("%s / %d\n",x.get(i).getNama(),y.get(i).getGaji());
        }
    }

    void MainMenu(){
        printFunction();
        System.out.println("Menu:");
        System.out.println("1. Urut Nama Ascending");
        System.out.println("2. Urut Gaji Descending");
        System.out.println("3. Exit");
        System.out.printf("Pilihan Anda [1-3]: ");
        do {
            secondChoices = sc1.nextInt();
            if (secondChoices == 1) {
                Collections.sort(x);
                MainMenu();
            }
            else if (secondChoices == 2) {
                Collections.sort(y, new SortbyGaji());
                MainMenu();
            }
        } while (secondChoices != 3);
    }

    App(){
        do {
            System.out.printf("Masukkan jumlah pegawai [3-5]: ");
            firstChoices = sc1.nextInt();
        } while (firstChoices < 3 || firstChoices > 5);
        System.out.println("");
        inputPegawai();
        MainMenu();
    }
}
