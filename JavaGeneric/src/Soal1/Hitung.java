package Soal1;

import java.util.ArrayList;

public class Hitung<T extends Comparable<T>> {
  private T[] nilai;
  ArrayList<T> x = new ArrayList<T>();

  public Hitung(T[] nilai) {
    this.nilai = nilai;
  }

  public T getMax() {
    T max = nilai[0];
    for (int i = 0; i < nilai.length; i++) {
      if (max.compareTo(nilai[i]) < 0) {
        max = nilai[i];
      }
    }
    return max;
  }
}
