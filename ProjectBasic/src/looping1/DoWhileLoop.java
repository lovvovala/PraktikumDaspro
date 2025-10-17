package looping1; // Atau sesuaikan dengan nama package-mu

public class DoWhileLoop {

    public int getOddNumbersAndSum(int max) {
        
        // Jika input 0 atau kurang, langsung kembalikan 0
        if (max <= 0) {
            return 0;
        }

        int totalSum = 0;
        int counter = 1; // "Pekerja" yang akan menghitung, mulai dari 1

        // Mulai perulangan do-while
        do {
            // Cek apakah angka saat ini (counter) adalah ganjil
            // Angka ganjil adalah angka yang jika dibagi 2 sisanya bukan 0
            if (counter % 2 != 0) {
                // Jika ganjil, tambahkan ke total
                totalSum += counter;
            }
            
            // Naikkan hitungan counter untuk putaran selanjutnya
            counter++;

        } while (counter <= max); // Ulangi selama counter masih kurang dari atau sama dengan max

        return totalSum;
    }
}