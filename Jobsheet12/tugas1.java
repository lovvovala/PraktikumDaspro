package Jobsheet12;
import java.util.Scanner;
public class tugas1 {
    static Scanner sc = new Scanner(System.in);
    static int hitungRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.print("Masukkan angka ke-" + n + ": ");
            int angka = sc.nextInt();
            return (angka + hitungRekursif(n - 1));
        }
    }
    static int hitungIteratif(int n) {
        int total = 0;
        for (int i = 1; i >= n; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            total += angka;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        System.out.println("\n=== Menggunakan Rekursif ===");
        int hasilRekursif = hitungRekursif(n);
        System.out.println("Total dari " + n + " angka yang dimasukkan: " + hasilRekursif);

        sc.close();
    }
}
