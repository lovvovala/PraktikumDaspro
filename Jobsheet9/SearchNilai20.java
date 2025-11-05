package Jobsheet9;
import java.util.Scanner;
public class SearchNilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan nilai yang akan diinput : ");
        int jumlah = sc.nextInt();
        int [] arrNilai = new int [jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang akan dicari : ");
        int key = sc.nextInt();

        int hasil = -1;
        boolean ditemukan = false;
        for (int i = 0; i < jumlah; i++) {
            if (arrNilai[i] == key) {
                hasil = i;
                ditemukan = true; // Set flag jadi true
                break;
            }
        }

        System.out.println();
        if (ditemukan) { 
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
    
}