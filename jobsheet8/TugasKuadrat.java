
public class TugasKuadrat {
  public static void main(String[] args) {

    System.out.println("Program Menghitung Jumlah Kuadrat 1 s.d n");
    System.out.println("=========================================");

     // Perulangan untuk n dari 1 sampai 5
        for (int n = 1; n <= 5; n++) {
            int jumlah = 0; // untuk menyimpan hasil jumlah kuadrat
            System.out.print("n = " + n + " => jumlah kuadrat = ");
            // Perulangan bersarang untuk menghitung dan menampilkan setiap kuadrat
            for (int i = 1; i <= n; i++) {
                int kuadrat = i * i;
                jumlah += kuadrat;
                System.out.print(kuadrat);
                
                // Tambahkan tanda '+' kecuali di angka terakhir
                if (i < n) {
                    System.out.print(" + ");
                }
            }
            // Tampilkan hasil jumlahnya
            System.out.println(" = " + jumlah);
        }
    }
  }  

