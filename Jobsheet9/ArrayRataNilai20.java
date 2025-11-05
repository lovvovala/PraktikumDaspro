package Jobsheet9;
import java.util.Scanner;
public class ArrayRataNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = sc.nextInt();
        int[] nilaiMhs = new int[jumMhs];
        double totalLulus = 0;
        double totalTdkLulus = 0;
        int hitungLulus = 0;
        int hitungTdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i]= sc.nextInt();
        }
       for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                hitungLulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                hitungTdkLulus++;
            }
        }

        double rata2Lulus = 0;
        if (hitungLulus > 0) {
            rata2Lulus = totalLulus / hitungLulus;
        }
        double rata2TdkLulus = 0;
        if (hitungTdkLulus > 0) {
            rata2TdkLulus = totalTdkLulus / hitungTdkLulus;
        }
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TdkLulus);
    }
    
}
