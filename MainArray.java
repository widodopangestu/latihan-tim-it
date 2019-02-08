import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

class Warga implements Serializable {
    private static final long serialVersionUID = 1L;
    String nama;
    String asal;
    Date ttl;

    public Warga(String nama, String asal, Date ttl) {
        this.nama = nama;
        this.asal = asal;
        this.ttl = ttl;
    }

    public String toString() {
        return this.nama;
    }
}

public class MainArray {
    public static void main(String args[]) {
        ArrayList<Warga> arr = new ArrayList<>();
        Warga warga = new Warga("Boy", "Pwj", new Date(2000, 6, 13));
        arr.add(warga);
        arr.add(warga);
        arr.add(warga);
        for (Warga w : arr) {
            System.out.println(w);
        }

        try {
            System.out.println("Write Object");
            // write object to file
            FileOutputStream fos = new FileOutputStream("data.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(arr);
            oos.close();

            // read object from file
            FileInputStream fis = new FileInputStream("data.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Warga> result = (ArrayList<Warga>) ois.readObject();
            ois.close();

            System.out.println("Jumlah data " + result.size());
            for (Warga wr : result) {
                System.out.println(wr);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}