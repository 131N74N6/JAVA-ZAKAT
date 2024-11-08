class Donatur {
    private String nama;
    private double gajiSebulan;
    private double penghasilanLainSebulan;

    // Konstruktor
    public Donatur(String nama, double gajiSebulan, double penghasilanLainSebulan) {
        this.nama = nama;
        this.gajiSebulan = gajiSebulan;
        this.penghasilanLainSebulan = penghasilanLainSebulan;
    }

    // Setter dan Getter nama donatur
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Setter dan Getter gaji sebulan
    public void setGajiSebulan(double gajiSebulan) {
        this.gajiSebulan = gajiSebulan;
    }

    public double getGajiSebulan() {
        return gajiSebulan;
    }

    // Setter dan Getter penghasilan lain sebulan
    public void setPenghasilanLain(double penghasilanLainSebulan) {
        this.penghasilanLainSebulan = penghasilanLainSebulan;
    }

    public double getPenghasilanLain() {
        return penghasilanLainSebulan;
    }

    // Metode untuk mengecek kewajiban zakat berdasarkan nisab
    public boolean apakahHarusMembayar() {
        double nisab = 6859394; // Nisab zakat per bulan 
        double penghasilan = gajiSebulan + penghasilanLainSebulan;
        return penghasilan >= nisab;
    }

    // Metode untuk menghitung jumlah zakat yang harus dibayar
    public double hitungZakat() {
        if (apakahHarusMembayar()) {
            double penghasilan = gajiSebulan + penghasilanLainSebulan;
            return penghasilan * 0.025; // Zakat 2.5% dari penghasilan
        }
        return 0;
    }
}
