package looping2;

public class WhileLoopNested {
    // Method ini yang menerima tinggi segitiga dan mengembalikan string pola
    public String getTriangle(int height) {
        
        StringBuilder triangleBuilder = new StringBuilder();
        int row = 1; // pekerja untuk menghitung baris, mulai dari 1

        // Loop LUAR: Mengontrol BARIS
        while (row <= height) {
            
            int col = 1; // Pekerja untuk menghitung BINTANG, direset setiap baris baru
            
            // Loop DALAM: Mengontrol BINTANG di baris saat ini
            while (col <= row) {
                triangleBuilder.append("*");
                col++; // Tambah 1 bintang
            }
            
            // Tambahkan baris baru HANYA jika ini BUKAN baris terakhir
            if (row < height) {
                triangleBuilder.append("\n");
            }
            
            row++; // Pindah ke baris berikutnya
        }
        
        // mengembalikan hasil akhir dari StringBuilder
        return triangleBuilder.toString();
    }
}
