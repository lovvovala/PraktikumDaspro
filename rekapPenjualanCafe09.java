package Jobsheet11;
import java.util.Scanner;

public class rekapPenjualanCafe09 {

    static String[] menu = {
            "Kopi Hitam",
            "Cappuccino",
            "Latte",
            "Teh Tarik",
            "Mie Goreng"
    };
    //INPUT DATA PENJUALAN 5 MENU x 7 HARI 
    public static void inputData(int[][] penjualan, Scanner sc) { 
        System.out.println("\n=== INPUT DATA PENJUALAN 7 HARI ===");

        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);

            for (int j = 0; j < 7; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    // TAMPILKAN TABEL PENJUALAN
    public static void tampilkanTabel(int[][] penjualan) {
        System.out.println("\n=== TABEL PENJUALAN 5 MENU SELAMA 7 HARI ===");

        System.out.print("Menu\t\t");
        for (int h = 1; h <= 7; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");

            if (menu[i].length() < 8) {
                System.out.print("\t");
            }

            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //MENU DENGAN PENJUALAN TERTINGGI
    public static void menuTertinggi(int[][] penjualan) {
        int max = 0;
        int indexMenu = 0;

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }

            if (total > max) {
                max = total;
                indexMenu = i;
            }
        }
        System.out.println("\n=== MENU DENGAN PENJUALAN TERTINGGI ===");
        System.out.println("Menu: " + menu[indexMenu]);
        System.out.println("Total Penjualan: " + max);
    }
    // RATA-RATA PENJUALAN SETIAP MENU
    public static void rataRataMenu(int[][] penjualan) {
        System.out.println("\n=== RATA-RATA PENJUALAN SETIAP MENU ===");

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }

            double rata = (double) total / 7;
            System.out.printf("%s : %.2f\n", menu[i], rata); 
        }
    }
    //FUNGSI UTAMA (MAIN) YANG SUDAH DIPERBAIK
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        int[][] penjualan = new int[5][7];

        inputData(penjualan, sc); 
        tampilkanTabel(penjualan);
        menuTertinggi(penjualan);
        rataRataMenu(penjualan);
    }
}