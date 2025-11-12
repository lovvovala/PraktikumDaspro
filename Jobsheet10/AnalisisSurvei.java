package Jobsheet10;
import java.util.Scanner;
public class AnalisisSurvei {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int[][] hasilSurvei = new int[10][6];
        double totalKeseluruhan = 0;

    System.out.println("=== Program Analisis Survei ===");
    System.out.println("Survei untuk 10 Responden dan 6 Pertanyaan");
    System.out.println("----------------------------------------------");

    for (int i = 0; i < 10; i++) {
            System.out.println("Memasukkan data untuk Responden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Input skor Pertanyaan " + (j + 1) + ": ");
                hasilSurvei[i][j] = sc.nextInt();
                
                totalKeseluruhan += hasilSurvei[i][j];
            }
    }
    System.out.println("\n----------------------------------------------");
    System.out.println("HASIL ANALISIS:");
    System.out.println("------------------------------------------------");
    
    for (int i = 0; i < 10; i++) {
            double totalResponden = 0;
            for (int j = 0; j < 6; j++) {
                totalResponden += hasilSurvei[i][j];
            }
            double rataResponden = totalResponden / 6.0;
            System.out.println("Rata-rata Responden ke-" + (i + 1) + ": " + rataResponden);
    }
    System.out.println("------------------------------------------------");

    for (int j = 0; j < 6; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                totalPertanyaan += hasilSurvei[i][j];
            }
            double rataPertanyaan = totalPertanyaan / 10.0;
            System.out.println("Rata-rata Pertanyaan ke-" + (j + 1) + ": " + rataPertanyaan);
    }
    System.out.println("------------------------------------------------");

    double rataKeseluruhan = totalKeseluruhan / (10.0 * 6.0);
    System.out.println("Rata-rata Keseluruhan (dari " + totalKeseluruhan + " poin): " + rataKeseluruhan);
    }
}
