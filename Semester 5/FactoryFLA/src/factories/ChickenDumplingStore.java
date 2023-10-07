package factories;

import model.ChickenDumpling;
import model.Dumpling;

public class ChickenDumplingStore extends DumplingStore {
    @Override
    protected Dumpling createDumpling() {
        // TODO Auto-generated method stub
        String ingredients = "Chicken";
        String name = "Chicken Dumpling";
        Integer price = 50000;
        System.out.println("Grilling Chicken!");
        return new ChickenDumpling(ingredients, name, price);
    }
}
