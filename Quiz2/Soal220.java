// Rachmah Nur Chotimah 254107060052 SIB 1A
package Quiz2;
import java.util.Scanner;
public class Soal220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // DEKLARASI VARIABEL
        int JumlahMahasiswa = 4;
        int JumlahMataKuliah= 3;
        int[][] nilai = new int[JumlahMahasiswa][JumlahMataKuliah];

        
        double[] rataRata = new double[JumlahMahasiswa];
        String[] status = new String[JumlahMahasiswa];
        for (int i = 0; i < JumlahMahasiswa; i++) {
            // Input nilai untuk setiap mata kuliah
            System.out.println("Masukkan nilai untuk Mata Kuliah ke-" + (i + 1) + ":");
            System.out.println("========================================================");
            
            int totalNilai = 0;
            //menghitung total nilai per mahasiswa
            for (int j = 0; j < JumlahMataKuliah; j++) {
                System.out.print("\nMasukkan nilai Matkul Ke- " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalNilai += nilai[i][j];
            }
            //menghitung rata-rata per mahasiswa
            rataRata[i] = (double) totalNilai / JumlahMataKuliah;
            //menentukan status lulus atau tidak lulus
            if (rataRata[i]>= 60) {
               String Status = "Lulus";
            } else {
                String Status = "Tidak Lulus";
            }
            
        }
        
       System.out.println("=== Daftar Nilai Mahasiswa ==="); 
        // Loop untuk menampilkan hasil per siswa
        for (int i = 0; i < JumlahMahasiswa; i++) {
            System.out.println("Siswa " + (i + 1) + ":");
            System.out.println("\trata-rata: " + String.format("%.2f", rataRata[i]));
            System.out.printf("\tStatus: %s\n", (rataRata[i] >= 60) ? "Lulus" : "Tidak Lulus");
        }
        
        sc.close();
    }
}

