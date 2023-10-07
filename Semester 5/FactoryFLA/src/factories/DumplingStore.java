package factories;

import model.Dumpling;

public abstract class DumplingStore {
    public DumplingStore() {
        
    }

    public Dumpling orderDumpling() {
        System.out.println("Creating dumpling!");
        Dumpling dumpling = createDumpling();
        System.out.println("Serving dumpling!");
        return dumpling;
    }

    protected abstract Dumpling createDumpling();
}
