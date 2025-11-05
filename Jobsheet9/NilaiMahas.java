package Jobsheet9;
import java.util.Scanner;
public class NilaiMahas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int n = sc.nextInt();

        int [] nilai = new int[n];
        System.out.println("========================================================");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.println("========================================================");
        if (n <= 0) {
            System.out.println("Tidak ada data nilai untuk diolah.");
            return;
        }

        double total = 0;
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];

        for (int i = 0; i < nilai.length; i++) {
        total += nilai[i];
            if (nilai[i] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
            nilaiTerendah = nilai[i];
            }
        }
        double rata2 = total / nilai.length;
        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + nilai[i]);
        }
        
        System.out.println("\n=== Hasil Analisis Nilai ===");
        System.out.println("Nilai Rata-rata  : " + rata2);
        System.out.println("Nilai Tertinggi  : " + nilaiTertinggi);
        System.out.println("Nilai Terendah   : " + nilaiTerendah);
    }
    
}
