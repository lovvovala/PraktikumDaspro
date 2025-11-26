package Jobsheet11;
import java.util.Scanner;
public class Kafe20 {
    public static void sapaPelanggan(String nama, boolean isMember) {
        System.out.println("-------------------------------------------");
        System.out.println("Selamat Datang, " + nama + "!");
        
        if (isMember) {
            System.out.println("Status: Member (Diskon 10% aktif)");
        } else {
            System.out.println("Status: Non-Member");
        }
        System.out.println("-------------------------------------------");
    }
    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   Rp 15,000");
        System.out.println("2. Cappuccino   Rp 20,000");
        System.out.println("3. Latte        Rp 22,000");
        System.out.println("4. Teh Tarik    Rp 12,000");
        System.out.println("5. Roti Bakar   Rp 10,000");
        System.out.println("6. Mie Goreng   Rp 18,000");
    }

    public static int hitungTotalHarga20(int pilihanMenu, int banyakItem) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;
        String lanjut;
        String namaPelanggan = "Budi";
        boolean isMember = true;
        
        sapaPelanggan(namaPelanggan, isMember);
        Menu();
        

        
       do {
            System.out.print("\nMasukkan nomor menu (1-6): ");
            int pilihanMenu = sc.nextInt();
            
            System.out.print("Masukkan banyak item: ");
            int banyakItem = sc.nextInt();
            
            int hargaItem = hitungTotalHarga20(pilihanMenu, banyakItem);
            totalKeseluruhan += hargaItem;
            
            sc.nextLine();
            System.out.print("Apakah Anda ingin memesan menu lain? (y/t): ");
            lanjut = sc.nextLine();
            
        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("\n-------------------------------------------");
        System.out.println("Subtotal (Sebelum Diskon): Rp " + totalKeseluruhan);


        if (isMember) {
            int diskonMember = totalKeseluruhan * 10 / 100;
            System.out.println("Diskon Member (10%)      : -Rp " + diskonMember);
            totalKeseluruhan -= diskonMember;
        }

        System.out.print("Masukkan kode promo (Jika ada): ");
        String kodePromo = sc.nextLine();
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode Promo Valid (50%)   : Berhasil!");
            totalKeseluruhan = totalKeseluruhan / 2; 
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode Promo Valid (30%)   : Berhasil!");
            totalKeseluruhan = totalKeseluruhan - (totalKeseluruhan * 30 / 100); 
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode Promo Invalid.");
        }

       
        System.out.println("TOTAL YANG HARUS DIBAYAR : Rp " + totalKeseluruhan);
    }
}
