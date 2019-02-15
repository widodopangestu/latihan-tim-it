import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TugasIT {
    public static void main(String[] args){
        try{
            // read object from file
            ArrayList<Warga> listData;
            File f = new File("data.txt");
            if(f.exists()) {
                FileInputStream fis = new FileInputStream("data.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
    
                listData = (ArrayList<Warga>) ois.readObject();
                ois.close();
            } else{
                listData = new ArrayList<>();
            }

            do{
                Warga warga = new Warga();
                System.out.print("Nama : ");
                warga.setNama(System.console().readLine());
                System.out.print("Asal : ");
                warga.setAsal(System.console().readLine());
                System.out.print("Tanggal Lahir(dd/mm/yyyy) : ");
                warga.setTtl(System.console().readLine());
                System.out.print("Jenis Kelamin (L/P) : ");
                warga.setJenisKel(System.console().readLine());
                System.out.print("0 : Lajarng\n1 : Menikah\n2 : Duda\n3 : Janda\nStatus Perkawinan : ");
                warga.setStatus(System.console().readLine());
                listData.add(warga);
                System.out.println("Lanjut Input?(Y/N)");
            } while (!System.console().readLine().equalsIgnoreCase("n"));

            System.out.println("===== List Data =====");
            for(Warga item: listData){
                System.out.println(item);
            }

            System.out.println("Write Object");
            // write object to file
            FileOutputStream fos = new FileOutputStream("data.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listData);
            oos.close();
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}