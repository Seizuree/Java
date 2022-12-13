import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<Data> c = new ArrayList<Data>();
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        new Main();
    }

    void MainMenu() {
        System.out.println("1. Input Data");
        System.out.println("2. Show Data");
        System.out.println("3. Delete Data");
        System.out.println("4. Exit");
        System.out.print("Your choice: ");
    }

    void AddData() {
        System.out.printf("Name : ");
        String name = sc2.nextLine();
        System.out.printf("Pass : ");
        String pass = sc2.nextLine();
        System.out.printf("Phone : ");
        String phone = sc2.nextLine();
        c.add(new Data(name, pass, phone));
    }

    void PrintData() {
        System.out.println(
                "===============================================================================================");
        System.out.println(
                "| No |            Name             |             Pass            |           Phone            |");
        System.out.println(
                "===============================================================================================");
        int i = 0;
        if (!c.isEmpty()) {
            for (Data x : c)
                System.out.printf("| %-3d| %-27s | %-27s | %-27s|\n", ++i, x.getName(), x.getPass(), x.getPhone());
        } else
            System.out.println(
                    "                                      |No data exist|                                         ");
    }

    void DeleteData() {
        PrintData();
        System.out.println("Input data number to be deleted : ");
        int deleted = 0;
        try {
            deleted = sc1.nextInt();
        } catch (Exception e) {

        }
        c.remove(deleted - 1);
        System.out.println("Data is removed");
    }

    Main() {
        int choices;
        do {
            MainMenu();
            choices = sc1.nextInt();
            sc1.nextLine();
            if (choices == 1) {
                AddData();
            } else if (choices == 2) {
                PrintData();
            } else if (choices == 3) {
                DeleteData();
            }
        } while (choices != 4);
        sc1.close();
        sc2.close();
    }
}