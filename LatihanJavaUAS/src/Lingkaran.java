public class Lingkaran extends Bentuk {
  private double radius;

  public Lingkaran() {
    this.radius = 0;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double hitungLuas() {
    return Math.PI * radius * radius;
  }

  @Override
  public double hitungKeliling() {
    return 2 * Math.PI * radius;
  }
}
