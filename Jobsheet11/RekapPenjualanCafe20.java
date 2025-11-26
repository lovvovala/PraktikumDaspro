package Jobsheet11;
import java.util.Scanner;
public class RekapPenjualanCafe20 {
    static String[] namaMenu;
    static void inputData(int[][] dataPenjualan, Scanner sc) {
        for (int i = 0; i < dataPenjualan.length; i++) {
            System.out.println("Input penjualan untuk menu: " + namaMenu[i]);
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    static void tampilData(int[][] dataPenjualan) {
        System.out.println("\n=== Rekap Data Penjualan ===");
        System.out.print("Menu\t\t");
        for (int j = 0; j < dataPenjualan[0].length; j++) {
            System.out.print("H-" + (j + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < dataPenjualan.length; i++) {
            System.out.print(namaMenu[i]);
            if (namaMenu[i].length() < 8) {
                System.out.print("\t\t");
            } else {
                System.out.print("\t");
            }
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                System.out.print(dataPenjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static void menuTertinggi(int[][] dataPenjualan) {
        int maxPenjualan = 0;
        int indexMenuTertinggi = 0;

        for (int i = 0; i < dataPenjualan.length; i++) {
            int totalMenu = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                totalMenu += dataPenjualan[i][j];
            }
            if (totalMenu > maxPenjualan) {
                maxPenjualan = totalMenu;
                indexMenuTertinggi = i;
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi: " + namaMenu[indexMenuTertinggi] + " (" + maxPenjualan + " item terjual)");
    }
    static void rataRataPenjualan(int[][] dataPenjualan) {
        System.out.println("\n=== Rata-rata Penjualan per Menu ===");
        for (int i = 0; i < dataPenjualan.length; i++) {
            double total = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                total += dataPenjualan[i][j];
            }
            double rataRata = total / dataPenjualan[i].length;
            System.out.printf("Rata-rata penjualan %s: %.2f item\n", namaMenu[i], rataRata);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah menu: ");
        int jumMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumHari = sc.nextInt();
        
        sc.nextLine();

        namaMenu = new String[jumMenu];
        int[][] dataPenjualan = new int[jumMenu][jumHari];

        for (int i = 0; i < jumMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.nextLine();
        }
        inputData(dataPenjualan, sc);
        tampilData(dataPenjualan);
        menuTertinggi(dataPenjualan);
        rataRataPenjualan(dataPenjualan);
    }
}