package Latian;
import java.util.Scanner;
public class GymArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] loker = new int[3][5];
        while (true) {
            System.out.print("Masukkan data loker (0 untuk kosong, 1 untuk terisi), baris demi baris:\n");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    loker[i][j] = sc.nextInt();
                }
            }
            sc.nextLine();
            System.out.print("Loker saat ini:\n");
            int jumlahKosong = 0; 

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    if (loker[i][j] == 0) {
                        System.out.print("[0] "); 
                        jumlahKosong++; 
                    } else {
                        System.out.print("[X] "); 
                    }
                }
                System.out.println(); 
            }
            System.out.println("Jumlah loker kosong: " + jumlahKosong);
            System.out.print("Apakah Anda ingin mengulangi? (ya/tidak): ");
            String ulang = sc.nextLine();
            if (ulang.equalsIgnoreCase("tidak")) {
                break;
            }
        
            
        }

    }

}

