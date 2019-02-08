import java.util.ArrayList;

class Warga {
    String nama;
    Integer usia;

    public Warga(String nama, Integer usia){
        System.out.println("Fungsi constructor ");
        this.nama = nama;
        this.usia = usia;
    }

    public Integer getUsia(){
        return this.usia;
    }

    public void setUsia(Integer usia){
        this.usia = usia;
    }

    public String toString(){
        return "Nama : " + this.nama + " Usia : " + this.usia;
    }
}
public class TestArray2 {
    public static void main(String args[]){

        Warga data = new Warga("Boy", 20);
        System.out.println("data : " + data);

        ArrayList<Integer> dataUmur = new ArrayList<>();
        dataUmur.add(20); //0
        dataUmur.add(22);
        ArrayList<Integer> dataK1 = new ArrayList<>();
        dataK1.add(77); //0
        dataK1.add(88);
        
        dataUmur.addAll(dataK1);
        dataUmur.add(26);
        dataUmur.add(71);
        dataUmur.add(100); // 4

        System.out.println("Jumlah Data : "+ dataUmur.size());
        for(Integer umur: dataUmur){
            System.out.println("Umur : " + umur);
        }
        System.out.println("========");
        System.out.println("Jumlah Data dataK1: "+ dataK1.size());
        for(Integer umur: dataK1){
            System.out.println("Umur : " + umur);
        }
    }
}