import java.util.Scanner;

public class act_m1 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        // input untuk memasukkan panjang sisi persegi
        System.out.print("Masukkan panjang sisi persegi (cm): ");
        double sisi = scanner.nextDouble();

        // Menghitung luas dan keliling
        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        // Menampilkan hasil
        System.out.printf("Luas persegi: %.2f cm²\n", luas);
        System.out.printf("Keliling persegi: %.2f cm\n", keliling);

        // Menutup scanner
        scanner.close();
    }
}
