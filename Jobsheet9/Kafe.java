package Jobsheet9;
import java.util.Scanner;

public class Kafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan : ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[n];
        int[] hargaPesanan = new int[n];
        int totalBiaya = 0;

        System.out.println("========================================================");
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine(); 

            totalBiaya += hargaPesanan[i]; 
        }

        System.out.println("\n=== DAFTAR PESANAN ANDA ===");
        for (int i = 0; i < n; i++) {
            System.out.println(namaPesanan[i] + "\t- Rp " + hargaPesanan[i]);
        }
        System.out.println("=========================================================");
        System.out.println("TOTAL BIAYA: \t\tRp " + totalBiaya);

        sc.close();
    }
}
