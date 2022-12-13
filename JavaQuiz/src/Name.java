public class Name implements Comparable<Name>{
    String nama;

    public Name(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int compareTo(Name compare){
        int compareInt = this.nama.compareTo(compare.nama);
        if(compareInt < 0) return -1;
        if(compareInt > 0) return 1;
        return 0;
    }
}
