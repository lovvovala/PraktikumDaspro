public class Latihan {
 public static void main(String[] args) {
    int n = 5; 

        // --- Outer Loop (untuk setiap nilai n dari 1 sampai N) ---
        // Variabel 'i' merepresentasikan nilai 'n' pada setiap baris output
        for (int i = 1; i <= n; i++) {
            
            // Inisialisasi/reset jumlahKuadrat di setiap awal iterasi outer loop
            // Ini penting agar perhitungan dimulai dari awal untuk setiap 'i'
            int jumlahKuadrat = 0;
            
            // --- Inner Loop (untuk menghitung 1^2 + 2^2 + ... + i^2) ---
            // Variabel 'j' akan mengulang dari 1 sampai 'i'
            for (int j = 1; j <= i; j++) {
                // Tambahkan kuadrat dari 'j' ke 'jumlahKuadrat'
                jumlahKuadrat = jumlahKuadrat + (j * j); 
            }
            
            // Cetak hasil untuk nilai 'i' saat ini
            System.out.println("n=" + i + " -> jumlah kuadrat = " + jumlahKuadrat);
        }
        }
    
    }

