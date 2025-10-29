import java.util.Scanner;
public class NilaiKelompok20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j;
        float nilai, totalNilai, rataNilai;
        float rataTertinggi = 0;        // untuk menyimpan rata-rata tertinggi
        int kelompokTertinggi = 0;      // untuk menyimpan nomor kelompok dengan rata-rata tertinggi


       
        while (i <= 3) {
            System.out.println("Kelompok ke-" + i);
            totalNilai = 0; 
            for (j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextFloat();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;

            System.out.println("Rata-rata nilai Kelompok ke-" + i + " adalah: " + rataNilai);
            System.out.println("-------------------------------------");

            // Cek apakah rata-rata ini adalah yang tertinggi
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            i++; 
        }
        // Tampilkan hasil akhir
        System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok ke-" + kelompokTertinggi + " dengan rata-rata " + rataTertinggi);

        sc.close();
    }
}

    

