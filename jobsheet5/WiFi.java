package jobsheet5;
import java.util.Scanner;
public class WiFi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== WIFI ACCESS ===");
        System.out.print("Masukkan Tipe Pengguna\t: ");
        String userType = sc.nextLine();
        
        if (userType.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if ( userType.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan Jumlah SKS\t: ");
            int SKS = sc.nextInt();
            if (SKS >= 12){
                System.out.println("Akses wifi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak , SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
        sc.close();
        } 
    }

