package Soal2;

public class Main {
  public static void main(String[] args) {
    new Main();
  }

  <T extends Comparable<T>> T getMax(T[] nilai) {
    T max = nilai[0];
    for (int i = 0; i < nilai.length; i++) {
      if (max.compareTo(nilai[i]) < 0) {
        max = nilai[i];
      }
    }
    return max;
  }

  Main() {
    Double[] x = { 1.1, 2.2, 3.3 };
    Integer[] y = { 1, 2, 3 };

    System.out.println(getMax(x));
    System.out.println(getMax(y));
  }
}
