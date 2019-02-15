public class Warga {
    private String Name;
    private int Umur;
    private Boolean jenKel;


    public Warga(String name, int umur, boolean jenKel){
        this.Name = name;
        this.Umur = umur;
        this.jenKel = jenKel;
    }

    public String getName(){
        return this.Name;
    }

    public String getName (String newName) {
        return (this.Name = newName);
    }

    public int getUmur(){
        return this.Umur;
    }

    public int setUmur (int newUmur) {
        return (this.Umur = newUmur);
    }

    public String getJenKel () {
        if(this.jenKel){
            return "Laki-Laki";
        } else{
            return "Perempuan";
        }
    }

    public void setJenKel(boolean jenKel) {
        this.jenKel = jenKel;
       }


    
    public String toString(){
        return String.format(this.Name + "\t" + this.Umur + "\t" + this.jenKel );
    }
    

}