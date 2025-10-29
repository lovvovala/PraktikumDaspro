import java.util.Scanner;
public class KafeSenja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int totalPelanggan = 0;
        int totalItem = 0;

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        // perulangan untuk tiap cabang
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");

            System.out.print("Jumlah pelanggan: ");
            int pelanggan = sc.nextInt();
            int totalItemCabang = 0;

            // perulangan untuk tiap pelanggan di cabang
            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            // tampilkan hasil per cabang
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + pelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);

            // akumulasi ke total semua cabang
            totalPelanggan += pelanggan;
            totalItem += totalItemCabang;
        }
        // tampilkan total keseluruhan
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItem);

        sc.close();
    }
}
