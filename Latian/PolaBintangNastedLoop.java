package Latian;
import java.util.Scanner;
public class PolaBintangNastedLoop {
   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    
         System.out.print("Masukkan nilai N = ");
         int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    for (int j = 1; j <= N; j++) {
                        System.out.print(j + " ");
                    }
                } else {
                    for (int j = 1; j <= N; j++) {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
         
   } 
}
