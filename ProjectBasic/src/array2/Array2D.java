package array2;

public class Array2D {
    public String getMatrixInfo(int[][] matrix) {
        StringBuilder resultBuilder = new StringBuilder();
        int totalSum = 0;
        int elementCount = 0;

        // Loop LUAR untuk mengakses setiap BARIS
        for (int i = 0; i < matrix.length; i++) {
            resultBuilder.append("Row ").append(i + 1).append(": ");
            
            // Loop DALAM untuk mengakses setiap KOLOM (elemen) di baris saat ini
            for (int j = 0; j < matrix[i].length; j++) {
                int number = matrix[i][j];
                
                // Menambahkan angka ke kalkulasi total
                totalSum += number;
                elementCount++;
                
                // Menambahkan angka ke string output
                resultBuilder.append(number);
                
                // Mengecek apakah angka genap atau ganjil, lalu tambahkan 'E' atau 'O'
                if (number % 2 == 0) {
                    resultBuilder.append("E");
                } else {
                    resultBuilder.append("O");
                }
                
                // Menambahkan spasi setelah setiap elemen
                resultBuilder.append(" ");
            }
            
            // Menambahkan baris baru setelah selesai memproses satu baris
            resultBuilder.append("\n");
        }

        // Menghitung rata-rata. Gunakan (double) agar hasilnya tidak dibulatkan
        double average = (double) totalSum / elementCount;

        // Menambahkan ringkasan total dan rata-rata
        resultBuilder.append("Total: ").append(totalSum).append("\n");
        resultBuilder.append("Average: ").append(average);

        // Mengembalikan hasil akhir
        return resultBuilder.toString();
    }
}
