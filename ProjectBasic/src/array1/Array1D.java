package array1;

public class Array1D {
    // Method yang menerima array integer dan mengembalikan info dalam bentuk String
    public String getArrayInfo(int[] numbers) {
        
        // Jika array-nya kosong, kembalikan format default
        if (numbers == null || numbers.length == 0) {
            return "\nSum: 0";
        }

        StringBuilder displayBuilder = new StringBuilder();
        int sum = 0;

        // Mengguunakan for-each loop untuk mengunjungi setiap elemen dalam array
        for (int number : numbers) {
            // Menambahkan angka dan spasi ke string
            displayBuilder.append(number).append(" ");
            // Menambahkan angka ke total penjumlahan
            sum += number;
        }

        // Menghapus spasi terakhir yang tidak perlu di akhir baris angka
        String numberList = displayBuilder.toString().trim();

        // Menggabungkan daftar angka dengan hasil penjumlahannya
        return numberList + "\nSum: " + sum;
    }
}
