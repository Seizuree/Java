public class SegiEmpat extends Bentuk {
  private double sisi;

  public SegiEmpat() {
    this.sisi = 0;
  }

  public double getSisi() {
    return sisi;
  }

  public void setSisi(double sisi) {
    this.sisi = sisi;
  }

  @Override
  public double hitungLuas() {
    return sisi * sisi;
  }

  @Override
  public double hitungKeliling() {
    return 4 * (sisi);
  }
}
