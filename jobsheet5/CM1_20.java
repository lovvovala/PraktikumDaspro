package jobsheet5;

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
        

    // Deklarasi variabel untuk predikat, kualifikasi, dan status kelulusan
        String predikat1, predikat2;
        String kualifikasi1, kualifikasi2;
        String status1, status2;
        

    // Menentukan predikat, kualifikasi, dan mutu untuk nilai akhir pertama
        if (na1 >= 80 && na1 <= 100) {
            predikat1 = "A"; 
        } else if (na1 >= 73) {
            predikat1 = "B+"; 
        } else if (na1 >= 65) {
            predikat1 = "B"; kualifikasi1 = "Baik";
        } else if (na1 >= 60) {
            predikat1 = "C+"; kualifikasi1 = "Lebih dari Cukup";
        } else if (na1 >= 50) {
            predikat1 = "C"; kualifikasi1 = "Cukup";
        } else if (na1 >= 39) {
            predikat1 = "D"; kualifikasi1 = "Kurang";
        } else {
            predikat1 = "E"; kualifikasi1 = "Gagal";
        }

     // Menentukan predikat, kualifikasi, dan mutu untuk nilai akhir kedua
        if (na2 >= 80 && na2 <= 100) {
            predikat2 = "A"; kualifikasi2 = "Sangat Baik";
        } else if (na2 >= 73) {
            predikat2 = "B+"; kualifikasi2 = "Lebih dari Baik";
        } else if (na2 >= 65) {
            predikat2 = "B"; kualifikasi2 = "Baik";
        } else if (na2 >= 60) {
            predikat2 = "C+"; kualifikasi2 = "Lebih dari Cukup";
        } else if (na2 >= 50) {
            predikat2 = "C"; kualifikasi2 = "Cukup";
        } else if (na2 >= 39) {
            predikat2 = "D"; kualifikasi2 = "Kurang";
        } else {
            predikat2 = "E"; kualifikasi2 = "Gagal";
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
        System.out.println("\n++++++ MENENTUKAN PENILAIAN AKADEMIK +++++");
        System.out.println("\nMata Kuliah\t\t\t UTS\t UAS\t Tugas\t Nilai Akhir\t Nilai Huruf\t Status");
        System.out.println("-------------------------------------------------------------------------------------------------");
    // Menampilkan hasil untuk setiap mata kuliah
    // String.format digunakan untuk membatasi angka desimal menjadi 2 tempat
        System.out.println("Algoritma dan Pemrograman\t " + uts1 + "\t " + uas1 + "\t " + tugas1 + "\t " + String.format("%.2f", na1) + "\t\t " + predikat1 + "\t\t " + status1);
        System.out.println("Struktur Data\t\t\t " + uts2 + "\t " + uas2 + "\t " + tugas2 + "\t " + String.format("%.2f", na2) + "\t\t " + predikat2 + "\t\t " + status2);
        
    // Tambahkan variabel rata supaya tidak error
        double rata = (na1 + na2) / 2;

    // Menentukan status kelulusan semester
        String statusSemester = (na1 >= 60 && na2 >= 60) 
            ? "LULUS SEMESTER (Kedua mata kuliah lulus)" 
            : "TIDAK LULUS SEMESTER (Salah satu atau kedua mata kuliah tidak lulus)";
            
    //Status Kelulusan Semester
        System.out.printf("Rata-rata Nilai Akhir : %.2f\n", rata);
        System.out.println("Status Semester       : " + statusSemester);
    }       
}
