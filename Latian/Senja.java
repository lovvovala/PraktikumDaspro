package Latian;
import java.util.Scanner;
public class Senja {
   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            int [] omzet = new int[7];
            int total = 0, max=0, harimax=0;
            double rata;

            for (int i = 0; i < omzet.length; i++) {
                System.out.print("Masukkan omzet hari ke-" + (i+1) + " : ");
                omzet[i] = sc.nextInt();
                total += omzet[i];
                if (omzet[i] > max) {
                max = omzet[i];
                harimax = i;
            }
            rata = (double) total / omzet.length;
            System.out.println("Total omzet: " + total);
            System.out.println("Rata-rata omzet: " + rata);
            System.out.println("Omzet tertinggi: " + max);
            System.out.println("Hari dengan omzet tertinggi: " + harimax);
        }
         
   }
}
