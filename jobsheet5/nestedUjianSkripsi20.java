package jobsheet5;
import java.util.Scanner;
public class nestedUjianSkripsi20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String PESAN;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak) : ");
        String bebasKompen =  sc.nextLine().trim();

        System.out.print("Masukkan Jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan Jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

             if (bebasKompen.equalsIgnoreCase("Ya")){
                 if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                PESAN ="Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";      
                 } else if (bimbinganP1 < 8 && bimbinganP2 < 4 ) {
                PESAN = "Gagal! Log bimbingan P! kurang dari 8 kali dan P2 kurang 4 kali";
                 } else if (bimbinganP1 < 8){
                PESAN = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
                } else {
                PESAN = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
                 }
             } else {
            PESAN = "GAGAL! Mahasiswa masih memiliki tanggungan kompen";
             }
             System.err.println(PESAN);
    }
}
