package jobsheet5.UTS;
import java.util.Scanner;
public class Bonus20 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mengimput Nilai Kinerja, Lama Bekerj,Sertifikasi & Gaji pokok
        System.out.println("=== BONUS KARYAWAN ===");
        System.out.print("Nilai Kinerja (1-100)\t\t: ");
        int kinerja = input.nextInt();
        System.out.print("Lama Bekerja (dalam tahun)\t: ");
        int lama = input.nextInt();
        input.nextLine(); // buang newline sisa sebelum baca string
        System.out.print("Sertifikasi (ya/tidak)\t\t: ");
        String Sertifikasi = input.nextLine();  
        System.out.print("Gaji Pokok\t\t\t: ");
        int gajiPokok = input.nextInt();

        // Jika nilai kinerja < 70 = tidak dapat bonus
        double bonus;
        if (kinerja < 70) {
            bonus = 0;
        } else {
            // Jika kinerja 70–89
            if (kinerja < 90) {
                if (lama < 2) {
                    bonus = 0.01 * gajiPokok;
                } else if (lama < 5) {
                    bonus = 0.03 * gajiPokok;
                } else {
                    bonus = 0.05 * gajiPokok;
                }
            } 
            // Jika kinerja >= 90
            else {
                if (lama < 2) {
                    bonus = 0.02 * gajiPokok;
                } else if (lama < 5) {
                    bonus = 0.04 * gajiPokok;
                } else {
                    bonus = 0.07 * gajiPokok;
                }
            }

            // Tambahan Rp500.000 kalau punya sertifikat
            if (Sertifikasi.equalsIgnoreCase("ya")) {
                bonus += 500000;
            }
        }

        // Menampilkan hasil bonus
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Nilai Kinerja\t: " + kinerja);
        System.out.println("Lama Bekerja\t: " + lama + " tahun");
        System.out.println("Sertifikasi\t: " + Sertifikasi);
        System.out.println("Gaji Pokok\t: Rp " + gajiPokok);
        System.out.println("Bonus\t\t: Rp " + (int)bonus);

        input.close();
    }
}
