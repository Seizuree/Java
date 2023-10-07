package main;

import factories.BeefDumplingStore;
import factories.ChickenDumplingStore;
import factories.DumplingStore;
import model.Dumpling;

public class App {
    public App() {
        DumplingStore chickenStore = new ChickenDumplingStore();
        Dumpling dumpling1 = chickenStore.orderDumpling();

        DumplingStore beefStore = new BeefDumplingStore();
        Dumpling dumpling2 = beefStore.orderDumpling();
    }

    public static void main(String[] args) {
        new App();
    }
}
