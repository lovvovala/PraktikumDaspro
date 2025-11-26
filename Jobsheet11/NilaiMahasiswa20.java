package Jobsheet11;
import java.util.Scanner;
public class NilaiMahasiswa20 {
    static void isianArray(int[] arrayNilai, Scanner input) {
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrayNilai[i] = input.nextInt();
        }
    }
    
    static void tampilArray(int[] arrayNilai) {
        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + arrayNilai[i]);
        }
    }

    static int hitTot(int[] arrayNilai) {
        int total = 0;
        for (int nilai : arrayNilai) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();
        
        int[] nilaiMahasiswa = new int[n];
        
        isianArray(nilaiMahasiswa, input);
        tampilArray(nilaiMahasiswa);
        
        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("\nTotal nilai semua mahasiswa: " + totalNilai);
        
        input.close();
    }
}
    

