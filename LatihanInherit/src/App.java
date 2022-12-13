import java.util.ArrayList;
import java.util.Scanner;

public class App {
    ArrayList<Jeep> jeep = new ArrayList<Jeep>();
    ArrayList<SUV> suv = new ArrayList<SUV>();
    ArrayList<Sedan> sedan = new ArrayList<Sedan>(); 
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        new App();
    }
    void Menu(){
        System.out.println("My Showroom");
        System.out.println("1. Buy");
        System.out.println("2. Show");
        System.out.println("3. Exit");
        System.out.printf(">> ");
    }
    void BuyMenu(){
        String carType;
        do {
            System.out.printf("Choose the car's type [Jeep / SUV / Sedan]: ");
            carType = sc2.nextLine();
        } while (!carType.equals("Jeep") || !carType.equals("SUV") || !carType.equals("Sedan"));
        String carName;
        do {
            System.out.printf("Enter the car's name: ");
            carName = sc2.nextLine();
        } while (carName.length() < 3);
        if (carType.equals("Jeep")) {
            jeep.add(new Jeep(carName));
        }
        else if (carType.equals("SUV")) {
            suv.add(new SUV(carName));
        }
        else if (carType.equals("Sedan")) {
            sedan.add(new Sedan(carName));
        }
    }
    void PrintCars(){
        System.out.println("Jeep");
        System.out.println(
                "================================================");
        System.out.println(
                "| No |            Car Name             |");
        System.out.println(
                "================================================");
        if (!jeep.isEmpty() || !suv.isEmpty() || !sedan.isEmpty()) {
            
        }
    }

    App(){
        int choices;
        do {
            Menu();
            choices = sc1.nextInt();
            sc1.nextLine();
            if (choices == 1) {
                BuyMenu();
            }
            else if (choices == 2) {
                
            }
        } while (choices != 3);
    }
}
