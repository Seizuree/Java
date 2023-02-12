package Soal1;

public class App {
    public static void main(String[] args) throws Exception {
        new App();
    }

    App() {        
        Double[] nilaiD = { 1.1, 2.2, 3.3 };
        Integer[] nilaiI = { 1, 2, 3 };

        Hitung<Double> hitungD = new Hitung<Double>(nilaiD);
        Hitung<Integer> hitungI = new Hitung<Integer>(nilaiI);

        System.out.println(hitungD.getMax());
        System.out.println(hitungI.getMax());
    }
}