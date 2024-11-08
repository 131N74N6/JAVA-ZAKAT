import java.util.Scanner;

public class Zakat {
    public static void main(String[] args) {
        char ulang;

        Scanner input = new Scanner(System.in);

        // Judul program
        System.out.println("TUGAS PEMROGRAMAN BERBASIS OBJEK");

        // Program
        do {
            System.out.print("Masukkan nama: ");
            String namaDonatur = input.nextLine();
            System.out.print("Masukkan gaji selama sebulan: ");
            double gajiSebulan = input.nextDouble();
            System.out.print("Masukkan penghasilan lain selama sebulan: ");
            double penghasilanLain = input.nextDouble();
            input.nextLine();  // Membersihkan buffer input

            // Membuat objek Donatur
            Donatur donatur = new Donatur(namaDonatur, gajiSebulan, penghasilanLain);

            // Mengecek apakah donatur wajib membayar zakat
            if (donatur.apakahHarusMembayar()) {
                // Input untuk Penerima
                System.out.print("Masukkan nama penerima: ");
                String namaPenerima = input.nextLine();
                System.out.print("Masukkan alamat penerima: ");
                String alamatPenerima = input.nextLine();
                System.out.print("Masukkan kategori penerima: ");
                String kategoriPenerima = input.nextLine();
                double total = donatur.hitungZakat();

                // Membuat objek Penerima
                Penerima penerima = new Penerima(namaPenerima, alamatPenerima, kategoriPenerima);

                System.out.println("\n" + donatur.getNama() + " membayar zakat sebesar: Rp " + total);
                System.out.println(
                    "Zakat ini akan disalurkan kepada " + penerima.getNama() + ", yang beralamat di " + 
                    penerima.getAlamat() + " sebagai kategori " + penerima.getKategori() + "."
                );
            } 
            else {
                System.out.println("\nAnda tidak perlu membayar zakat karena penghasilan di bawah nisab.");
            }

            // Tanya apakah pengguna ingin kalkulasi lagi
            System.out.print("Apakah Anda ingin mengkalkulasi lagi (y/n)? ");
            ulang = input.next().charAt(0);
            input.nextLine();  // Membersihkan buffer input

        } while(ulang == 'y' || ulang == 'Y');

        // Rasa terima kasih
        System.out.println("...TERIMA KASIH SUDAH MENGGUNAKAN PROGRAM INI :) ...");
        input.close();
    }
}
