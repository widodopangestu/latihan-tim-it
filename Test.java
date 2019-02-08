
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Widodo");
        s.setJenKel(true);
        s.cetak();
        Student b = new Student();
        b.setName("Ani");
        b.setJenKel(false);
        b.cetak();
        Test test = new Test();
        test.deretPrima();
    }

    public void deretPrima() {
        String lanjut;
        do {
            System.out.println("Lanjutkan (Y/N) : ");
            lanjut = System.console().readLine();
        } while (lanjut.equalsIgnoreCase("Y"));
    }
}
