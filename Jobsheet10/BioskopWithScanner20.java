package Jobsheet10;
import java.util.Scanner;
public class BioskopWithScanner20 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String [][] penonton = new String[4][2];
    
 while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            
            int pilihanMenu = sc.nextInt();
            sc.nextLine();

            switch (pilihanMenu) {
                case 1:
                    System.out.println("=== Input Data Penonton ===");
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        int baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        int kolom = sc.nextInt();
                        sc.nextLine();
                        
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Error: Nomor baris atau kolom tidak valid. Harap masukkan lagi.");
                            continue;
                        }
                        
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Error: Kursi (" + baris + "," + kolom + ") sudah terisi. Harap pilih kursi lain.");
                            continue;
                        }

                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton '" + nama + "' berhasil disimpan.");
                        
                        break;
                    }
                    break;

                case 2:
                    System.out.println("=== Daftar Penonton ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih, keluar dari program.");
                    return;

                default:
                    System.out.println("Error: Pilihan menu tidak valid. Coba lagi.");
            }
        }
   } 
}
