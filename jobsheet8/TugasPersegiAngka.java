import java.util.Scanner;
public class TugasPersegiAngka {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan nilai n (minimal 3): ");
    int n = sc.nextInt();
    
    if (n < 3) {
            System.out.println("Nilai n minimal 3!");
            return;
        }

        // Perulangan baris
        for (int i = 1; i <= n; i++) {
            // Perulangan kolom
            for (int j = 1; j <= n; j++) {
                // Kondisi cetak angka di border
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  "); // spasi di tengah
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

   
