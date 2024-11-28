package pertemuan2_50421504;

// Deklarasi class
class Manusia {
    // Atribut atau properties
    String nama;
    int usia;

    // Constructor untuk menginisialisasi atribut
    Manusia(String n, int u) {
        nama = n;
        usia = u;
    }

    // Method untuk menampilkan informasi
    void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Usia: " + usia);
    }
}

// Class utama untuk menjalankan program
public class act_m2 {
    public static void main(String[] args) {
        // Membuat objek dari class Manusia
        Manusia orang1 = new Manusia("Budi", 25);

        // Memanggil method untuk menampilkan informasi
        orang1.tampilkanInfo();
    }
}
