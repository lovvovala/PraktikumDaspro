package Quiz2;
// Rachmah Nur Chotimah 254107060052 SIB 1A
import java.util.Scanner;
public class Soal320 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // deklarasi untuk jumlah mata kuliah
        final int JUMLAH_MATKUL = 3;
        String[] namaMatkul = {"Matkul 1", "Matkul 2", "Matkul 3"};

        // input jumlah mahasiswa
        System.out.println("=== PROGRAM PENGELOLAAN NILAI ===");
        System.out.print("Masukkan jumlah mahasiswa (n): ");
        int n = sc.nextInt();
        sc.nextLine(); 

        
        int[][] nilai = new int[n][JUMLAH_MATKUL]; 
        char[][] grade = new char[n][JUMLAH_MATKUL]; 
        double[] rataRataMahasiswa = new double[n];  
        double[] rataRataMatkul = new double[JUMLAH_MATKUL]; 
        String[] namaMahasiswa = new String[n];   

        // input data mahasiswa dan nilai
        System.out.println("\n====================== INPUT DATA ======================");
        for (int i = 0; i < n; i++) {
            System.out.print("\nMasukkan Nama Mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = sc.nextLine();
            
            int totalNilaiMahasiswa = 0;

        
            for (int j = 0; j < JUMLAH_MATKUL; j++) {
                int currentNilai;
                
                
                do {
                    System.out.print("  Nilai " + namaMatkul[j] + " (0-100): ");
                    currentNilai = sc.nextInt();
                    if (currentNilai < 0 || currentNilai > 100) {
                        System.out.println("Nilai harus antara 0 dan 100. Coba lagi.");
                    }
                } while (currentNilai < 0 || currentNilai > 100);
                
                
                nilai[i][j] = currentNilai;
                totalNilaiMahasiswa += currentNilai;

                // menentukan grade
                if (currentNilai >= 85) {
                    grade[i][j] = 'A';
                } else if (currentNilai >= 70) {
                    grade[i][j] = 'B';
                } else if (currentNilai >= 55) {
                    grade[i][j] = 'C';
                } else if (currentNilai >= 40) {
                    grade[i][j] = 'D';
                } else {
                    grade[i][j] = 'E';
                }
            }
            sc.nextLine(); 
            
            // menghitung rata-rata per mahasiswa
            rataRataMahasiswa[i] = (double) totalNilaiMahasiswa / JUMLAH_MATKUL;
        }

        // menghitung rata-rata per mata kuliah
        for (int j = 0; j < JUMLAH_MATKUL; j++) {
            int totalNilaiMatkul = 0;
            for (int i = 0; i < n; i++) {
                totalNilaiMatkul += nilai[i][j];
            }
            rataRataMatkul[j] = (double) totalNilaiMatkul / n;
        }
        
        
        // menampilkan tabel nilai dan grade mahasiswa
        System.out.println("\n========================================================");
        System.out.println("=== TABEL NILAI DAN GRADE MAHASISWA ===");
        
        
        System.out.printf("%-20s | %-15s | %-15s | %-15s | %s\n", 
                          "NAMA MAHASISWA", namaMatkul[0], namaMatkul[1], namaMatkul[2], "RATA-RATA");
        System.out.println("--------------------------------------------------------------------------------");
        
        
        for (int i = 0; i < n; i++) {
           
            System.out.printf("%-20s | ", namaMahasiswa[i]);
            
            
            for (int j = 0; j < JUMLAH_MATKUL; j++) {
                System.out.printf("%d (%c)%7s | ", nilai[i][j], grade[i][j], "");
            }
            
           
            System.out.printf("%.2f\n", rataRataMahasiswa[i]);
        }
        System.out.println("--------------------------------------------------------------------------------");

        
        System.out.printf("%-20s | ", "Rata-Rata Matkul");
        for (int j = 0; j < JUMLAH_MATKUL; j++) {
            System.out.printf("%.2f%10s | ", rataRataMatkul[j], "");
        }
        System.out.println();
        System.out.println("========================================================");

        // menampilkan statistik mata kuliah dengan rata-rata tertinggi
        
        double maxRataRata = rataRataMatkul[0];
        String matkulTertinggi = namaMatkul[0];
        
        for (int j = 1; j < JUMLAH_MATKUL; j++) {
            if (rataRataMatkul[j] > maxRataRata) {
                maxRataRata = rataRataMatkul[j];
                matkulTertinggi = namaMatkul[j];
            }
        }
        
        System.out.println("\n*** STATISTIK ***");
        System.out.printf("Mata Kuliah dengan Rata-Rata Tertinggi adalah: **%s** (Rata-rata: **%.2f**)\n", 
                          matkulTertinggi, maxRataRata);
        System.out.println("========================================================");

        sc.close();
    }
}
