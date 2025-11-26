package Latian;
import java.util.Scanner;
public class DoWhileValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jml_Stock;
        
         do {
            System.out.print("Masukkan Jumlah Barang yang Dibeli : ");
            jml_Stock = scanner.nextInt();

            if (jml_Stock < 0) {
                System.out.println("Stok tidak valid, Silakan masukkan ulang.");
            } else {
                System.out.println("Stok berhasil disimpan :" + jml_Stock);
                break; 
            }
        } while (true);
    }   
} 
