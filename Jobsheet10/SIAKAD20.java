package Jobsheet10;
import java.util.Scanner;
public class SIAKAD20 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah Mata Kuliah: ");
        int jumMatkul = sc.nextInt();
    int [][] nilai = new int[jumSiswa][jumMatkul];
    

    for (int i = 0; i < nilai.length; i++) {
        System.out.println("Input nilai mahasiswa ke-" + (i + 1));
        double totalPerSiswa = 0;
        for (int j = 0; j < nilai[i].length; j++) {
            System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
            nilai[i][j] = sc.nextInt();
            totalPerSiswa += nilai[i][j];
        }
        System.out.println("Nilai rata-rata: " + + (totalPerSiswa / nilai[i].length) );
    }
    System.out.println("\n=========================");
    System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
    for (int j = 0; j < jumMatkul; j++) { 
            double totalPerMatkul = 0;
            
            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            // Menggunakan nilai.length (atau jumSiswa) untuk pembagi
            System.out.println("Mata Kuliah " + (j + 1) + ": " + (totalPerMatkul / nilai.length));
        }
   } 
}
