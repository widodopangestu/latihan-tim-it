import java.text.SimpleDateFormat;
import java.io.Serializable;
import java.text.ParseException;;
import java.util.Date;

public class Warga implements Serializable {
    private String nama;
    private String asal;
    private Date ttl;
    private Boolean jenisKel;
    private Integer status;

    public Warga() {

    }

    public Warga(String nama, String asal, Date ttl, Boolean jenisKel) {
        this.nama = nama;
        this.asal = asal;
        this.ttl = ttl;
        this.jenisKel = jenisKel;
        this.status = status;
    }

    /**
     * @return String return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return String return the asal
     */
    public String getAsal() {
        return asal;
    }

    /**
     * @param asal the asal to set
     */
    public void setAsal(String asal) {
        this.asal = asal;
    }

    /**
     * @return Date return the ttl
     */
    public Date getTtl() {
        return ttl;
    }

    /**
     * @param ttl the ttl to set
     */
    public void setTtl(Date ttl) {
        this.ttl = ttl;
    }

    /**
     * @param ttl the ttl to set
     */
    public void setTtl(String ttl) {
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        try{
            this.ttl = format.parse(ttl);
        } catch(ParseException e){
            System.err.println(e.getMessage());
        }
    }

    /**
     * @return String return the ttl
     */
    public String getTtlFormat() {
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        return format.format(this.ttl);
    }

    /**
     * @return Boolean return the jenisKel
     */
    public Boolean isJenisKel() {
        return jenisKel;
    }

    /**
     * @param jenisKel the jenisKel to set
     */
    public void setJenisKel(Boolean jenisKel) {
        this.jenisKel = jenisKel;
    }

    /**
     * @param jenisKel the jenisKel to set
     */
    public void setJenisKel(String jenisKel) {
        this.jenisKel = jenisKel.equalsIgnoreCase("L");
    }

    /**
     * @return String return the jenisKel
     */
    public String getJenisKel() {
        return jenisKel ? "Laki-Laki" : "Perempuan";
    }

    /**
     * @return Integer return the status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = Integer.parseInt(status);
    }

    /**
     * @return String return the status
     */
    public String getStatusText() {
        String[] status = { "Lajang", "Menikah", "Duda", "Janda" };
        return status[this.status];
    }

    public String toString() {
        return String.format("Nama : %s \nAsal : %s\nTanggal Lahir : %s\nJenis Kelamin : %s\nStatus : %s",
                this.getNama(), this.getAsal(), this.getTtlFormat(), this.getJenisKel(), this.getStatusText());
    }
}