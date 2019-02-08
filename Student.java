public class Student {
    private String name;
    private boolean jenKel;

    public void cetak(){
        System.out.println("Name : " + this.getName());
        System.out.println("Jenis Kemin : " + this.getJenKel());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJenKel() {
        if(this.jenKel){
            return "Laki-Laki";
        } else{
            return "Perempuan";
        }
    }

    public void setJenKel(boolean jenKel) {
        this.jenKel = jenKel;
    }
}
