import java.util.ArrayList;



public class Looping {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("===============");
        int a = 0;
        while (a < 10) {
            System.out.print(a);
            a++;
        }

        System.out.println("===============");
        String [] dataAnak = new String[3];
        int index = 0;
        do {
            System.out.println("Input Nama : ");
            String nama = System.console().readLine();
            dataAnak[index]=nama;
            System.out.println("Input Lagi ? (Y/N) ");
            index++;
        } while (!System.console().readLine().equalsIgnoreCase("n"));

        System.out.println("Data nama anak");
        for(String nama: dataAnak){
            System.out.println(nama);
            if(nama.equalsIgnoreCase("budi")) break;
        }
    }
}