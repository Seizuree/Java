import java.util.Comparator;

public class SortbyGaji implements Comparator<Gaji>{
    public int compare(Gaji x, Gaji y) {
        return x.gaji - y.gaji;
    }
}