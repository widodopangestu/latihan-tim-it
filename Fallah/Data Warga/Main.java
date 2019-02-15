import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    ArrayList<Warga> warga = new ArrayList<Warga>();
    warga.add(new Warga("Fallah", 18, Boolean.TRUE));
    warga.add(new Warga("Zulfan", 19, true));
    warga.add(new Warga("Harry", 19, true));
    warga.add(new Warga("Hibban", 18, true));

    
    System.out.println("Nama\tUmur\tJenis Kelamin");
    for(Warga w : warga){
      System.out.println(w);
    }
}
}