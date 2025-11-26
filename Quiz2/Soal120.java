package Quiz2;

import java.util.Scanner;

public class Soal120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Rachmah Nur Chotimah 254107060052 SIB 1A
        // input angka dan simpan dalam array
        System.out.print("Masukkan angka yang akan diinput: ");
        int n = sc.nextInt();

        // deklarasi array
        int[] angka = new int[n];
        System.out.println("========================================================");
        // input elemen array
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        System.out.println("========================================================");
        // ini ada pengecekan jika n kurang dari atau sama dengan 0
        if (n <= 0) {
            System.out.println("Tidak ada angka untuk diolah.");
            return;
        }
        // proses hitung ganjil genap
        int nilaiganjil = 0;
        int nilaigenap = 0;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 0) {
                nilaigenap++;
            } else {
                nilaiganjil++;
            }
        }
        // output hasil
        System.out.println("\n=== Hasil Analisis Angka ===");
        System.out.println("Nilai Ganjil  : " + nilaiganjil);
        System.out.println("Nilai Genap : " + nilaigenap);
        System.out.println("Total Nilai : " + n);
        System.out.println("========================================================");
        System.out.println("Daftar Bilangan :");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Angka ke-" + (i + 1) + ": " + angka[i]);
        }
    }
}
