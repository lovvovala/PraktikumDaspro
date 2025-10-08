package PraktikumDaspro.jobsheet5;

import java.util.Scanner;

public class CM1_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input data dari mahasiswa agar mengetahui kepemilikan nilai nantinya
        System.out.println("==== DATA MAHASISWA =====");
        System.out.print("Nama\t\t: ");
        String nama = sc.nextLine();
        System.out.print("NIM\t\t: ");
        long nim = sc.nextLong();
        System.out.println("=================================================");

        // untuk menginput nilai mahasiswa baik matkul pertama maupun kedua
        System.out.println("#### Mata kuliah 1 : Algoritma Pemrograman ####");
        System.out.print("Nilai UTS\t: ");
        int uts1 = sc.nextInt();
        System.out.print("Nilai UAS\t: ");
        int uas1 = sc.nextInt();
        System.out.print("Nilai Tugas\t: ");
        int tugas1 = sc.nextInt();

        System.out.println("#### Mata kuliah 2 : Struktur Data ####");
        System.out.print("Nilai UTS\t: ");
        int uts2 = sc.nextInt();
        System.out.print("Nilai UAS\t: ");
        int uas2 = sc.nextInt();
        System.out.print("Nilai Tugas\t: ");
        int tugas2 = sc.nextInt();

        //Hitung nilai akhir
        double na1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        double na2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);
        double rataRata = (na1+na2)/2;

        //Menentukan kriteria 
        String grade, kualifikasi, status1,status2;
        double mutu;

         if (rataRata >= 60) { // Minimal lulus
              if (rataRata > 80 && rataRata <= 100) {
                    grade = "A"; mutu = 4.0; kualifikasi = "Sangat Baik";
                } else if (rataRata >= 73 && rataRata <= 80) {
                    grade = "B+"; mutu = 3.5; kualifikasi = "Lebih dari Baik";
                } else if (rataRata >= 65 && rataRata < 73) {
                    grade = "B"; mutu = 3.0; kualifikasi = "Baik";
                } else if (rataRata >= 60 && rataRata < 65) {
                    grade = "C+"; mutu = 2.5; kualifikasi = "Lebih dari Cukup";
             } else {
                grade = "C"; mutu = 2.0; kualifikasi = "Cukup";
         }
    } else { // Jika < 60 berarti tidak lulus
        if (rataRata >= 50 && rataRata < 60) {
            grade = "C"; mutu = 2.0; kualifikasi = "Cukup";
        } else if (rataRata >= 39 && rataRata < 50) {
             grade = "D"; mutu = 1.0; kualifikasi = "Kurang";
        } else {
            grade = "E"; mutu = 0.0; kualifikasi = "Gagal";
     }
    }

    // Nested IF untuk kelulusan tiap matkul
    if (na1 >= 60) {
    status1 = "LULUS";
        if (na2 >= 60) {
        status2 = "LULUS";
        } else {
        status2 = "TIDAK LULUS";
    }
    } else {
    status1 = "TIDAK LULUS";
        if (na2 >= 60) {
        status2 = "LULUS";
        } else {
        status2 = "TIDAK LULUS";
    }
}


        // tabel menentukkan Penilaian akademik 
        System.out.println("++++++ MENENTUKAN PENILAIAN AKADEMIK +++++");
         System.out.println("\nMata Kuliah\t\t\t UTS\t UAS\t Tugas\t Nilai Akhir\t Nilai Huruf\t Status");
        System.out.println("-------------------------------------------------------------------------------------------------");
        // Menampilkan hasil untuk setiap mata kuliah
        // String.fortmat digunakan untuk membatasi angka desimal menjadi 2 tempat
        System.out.println("Algoritma dan Pemrograman\t " + uts1 + "\t " + uas1 + "\t " + tugas1 + "\t " + String.format("%.2f", na1) + "\t\t " + grade + "\t\t " + status1);
        System.out.println("Struktur Data\t\t\t " + uts2 + "\t " + uas2 + "\t " + tugas2 + "\t " + String.format("%.2f", na2) + "\t\t " + grade + "\t\t " + status2);
        
        // Menghitung rata-rata nilai status
        double rata = (na1 + na2) / 2;
        String statusSemester = (rata >= 70) ? "LULUS (Rata-rata ≥ 70)" : "TIDAK LULUS (Rata-rata < 70)";

        //Status Kelulusan Semester
        System.out.printf("Rata-rata Nilai Akhir : %.2f\n", rata);
        System.out.println("Status Semester       : " + statusSemester);
}       
    }
        

       

    


