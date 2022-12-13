import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        new App();
    }

    void MainMenu(){
        System.out.println("Area Calculator Program");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.printf(">> ");
    }

    void countRectangle(){
        Scanner rec = new Scanner(System.in);
        System.out.printf("Enter the width: ");
        double width = rec.nextDouble();
        System.out.printf("Enter the length: ");
        double length = rec.nextDouble();
        Shape rectangle = new Rectangle(width, length);
        System.out.printf("The rectangle width is %.1f and the length is %.1f\n", width, length);
        System.out.printf("The area of this rectangle is %.1f\n", rectangle.getArea());
        rec.close();
    }

    void countCircle(){
        Scanner crc = new Scanner(System.in);
        System.out.printf("Enter the radius: ");
        double radius = crc.nextDouble();
        Shape circle = new Circle(radius);
        System.out.printf("The circle radius is %.1f\n",radius);
        System.out.printf("The area of this circle is %.1f\n", circle.getArea());
        crc.close();
    }

    void countTriangle(){
        Scanner tri = new Scanner(System.in);
        System.out.printf("Enter the base: ");
        double base = tri.nextDouble();
        System.out.printf("Enter the height: ");
        double height = tri.nextDouble();
        Shape triangle = new Triangle(base, height);
        System.out.printf("The triangle base is %.1f and the height is %.1f\n", base,height);
        System.out.printf("The area of this triangle is %.1f\n", triangle.getArea());
        tri.close();
    }

    App(){
        Scanner sc = new Scanner(System.in);
        int choices = 0;
        do {
            MainMenu();
            choices = sc.nextInt();
        } while (choices < 1 || choices > 5);
        if (choices == 1) {
            countRectangle();
        }
        else if(choices == 2){
            countTriangle();
        }
        else if(choices == 3){
            countCircle();
        }
        else if(choices == 4){
            System.out.println("Thank you for using this program!!!");
            sc.nextLine();
        }
        choices = 0;
        sc.close();
    }
}