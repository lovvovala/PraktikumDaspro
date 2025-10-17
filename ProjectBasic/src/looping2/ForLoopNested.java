package looping2;

public class ForLoopNested {

    // Method yang menerima ukuran grid dan mengembalikan hasil berupa string grid
    public String getGrid(int max) {
        
        // StringBuilder digunakan agar proses penggabungan string di dalam perulangan lebih efisien
        StringBuilder gridBuilder = new StringBuilder();

        // Perulangan luar: digunakan untuk menentukan baris (row)
        for (int row = 1; row <= max; row++) {
            
            // Perulangan dalam: digunakan untuk menentukan kolom (col)
            for (int col = 1; col <= max; col++) {
                
                // Menambahkan teks yang menunjukkan posisi baris dan kolom saat ini
                gridBuilder.append("Row ").append(row).append(" Col ").append(col);
                
                // Mengecek apakah posisi saat ini bukan merupakan elemen terakhir di seluruh grid
                // Kondisi ini akan bernilai false hanya ketika berada pada baris dan kolom terakhir
                if (row < max || col < max) {
                    // Jika bukan yang terakhir, tambahkan baris baru
                    gridBuilder.append("\n");
                }
            }
        }
        
        // Mengembalikan hasil akhir dari StringBuilder dalam bentuk string
        return gridBuilder.toString();
    }
}