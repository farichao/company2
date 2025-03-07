class Perusahaan{
    private final String namaPerusahaan;

    public Perusahaan(String namaPerusahaan){
        this.namaPerusahaan = namaPerusahaan;
    }
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

}

class Karyawan{
    private String nama;
    private double gajiPokok;
    private Perusahaan perusahaan;


    public Karyawan(String nama, double gajiPokok, Perusahaan perusahaan){
        this.gajiPokok = gajiPokok;
        this.perusahaan = perusahaan;
        setNama(nama);

    }

    void setNama(String nama){
        if (nama.length()>=4){
            this.nama = nama;
        }
        else{
            throw new IllegalArgumentException("Nama harus minimal 4 karakter!");
        }

    }
    public String getNama(){
        return nama;
    }

    public String getGajiPokok(){
        return String.format("Rp %, .2f", gajiPokok);
    }

   public void info(){
    System.out.println("Nama Karyawan  : " + getNama());
    System.out.println("Gaji Pokok     : Rp. " + getGajiPokok());
    System.out.println("Perusahaan     : " + perusahaan.getNamaPerusahaan());
    System.out.println("-------------------------");

    }
}

public class Main {
    public static void main(String[] args) {
        Perusahaan p1 = new Perusahaan("pt.kurma");
        Karyawan k1 = new Karyawan("bintan", 2000, p1);
        Karyawan k2 = new Karyawan("andin",40000,p1);
        k1.info();
        k2.info();
        
    }

    
}
