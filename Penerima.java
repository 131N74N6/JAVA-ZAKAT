public class Penerima {
    private String nama;
    private String alamat;
    private String kategori;

    // Konstruktor
    public Penerima(String nama, String alamat, String kategori) {
        this.nama = nama;
        this.alamat = alamat;
        this.kategori = kategori;
    }

    // Setter dan getter untuk nama penerima
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Setter dan getter untuk alamat penerims
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    // Setter dan getter untuk kategori
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }
}
