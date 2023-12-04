package factories;

import model.BeefDumpling;
import model.Dumpling;

public class BeefDumplingStore extends DumplingStore{
    @Override
    protected Dumpling createDumpling() {
        String ingredients = "Beef";
        String name = "Beef Dumpling";
        Integer price = 50000;
        System.out.println("Grilling Beef!");
        return new BeefDumpling(ingredients, name, price);
    }
}
