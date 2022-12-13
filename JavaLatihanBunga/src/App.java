import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        double tabungan = 0;
        double bunga = 0;
        System.out.printf("Masukkan Nilai Tabungan: ");
        try {
            tabungan = sc1.nextDouble();
        } catch (Exception e) {}
        System.out.printf("Masukkan Bunga Tahunan: ");
        try {
            bunga = sc2.nextDouble();
        } catch (Exception e) {}
        double totalTabungan = 0.0;
        totalTabungan = tabungan;
        for (int i = 0; i <= 12; i++) {
            System.out.printf("Saldo tabungan bulan %d: %.2f\n",i,totalTabungan);
            totalTabungan = totalTabungan * (1+(bunga/12)/100);
        }
        sc1.close();
        sc2.close();
    }
}
