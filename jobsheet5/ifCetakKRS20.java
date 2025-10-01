package PraktikumDaspro.jobsheet5;
import java.util.Scanner;
public class ifCetakKRS20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" === Cetak KRS SIAKAD ===");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        String hasil = uktLunas 
                        ? "Pembayaran UKT terverifikasi\nSilahkan Cetak KRS dan minta tanda tangan DPA"
                        : "Registrasi ditolak, Silahkan lunasi UKT terlebih dahulu!";

        System.out.println(hasil);
    
    }
}
