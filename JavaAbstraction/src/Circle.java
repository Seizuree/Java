public class Circle extends Shape {
  private double radius;
  final double pi = Math.PI;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return pi * radius * radius;
  }
}
