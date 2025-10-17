package looping1;

public class ForLoop {
   // Method untuk menjumlahkan angka dari 1 sampai 'max'
    public int getNumbersAndSum(int max) {
        
        // Siapkan variabel untuk menampung total penjumlahan, mulai dari 0
        int totalSum = 0;
        
        // Gunakan for loop untuk iterasi dari 1 sampai 'max'
        // i = 1      -> Mulai dari 1
        // i <= max   -> Lanjutkan selama i masih kurang dari atau sama dengan 'max'
        // i++        -> Tambah i dengan 1 di setiap putaran
        for (int i = 1; i <= max; i++) {
            // Tambahkan angka saat ini (i) ke totalSum
            totalSum = totalSum + i; // atau bisa disingkat: totalSum += i;
        }
        
        // Kembalikan hasil akhir penjumlahan
        return totalSum;
    } 
}
