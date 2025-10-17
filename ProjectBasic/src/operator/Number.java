package operator;

public class Number {
   // Method yang menerima dua integer dan mengembalikan String
    public String getOperatorResults(int a, int b) {

        // Lakukan semua operasi yang diminta
        int sum = a + b;
        int product = a * b;
        boolean isEqual = (a == b);
        boolean logicalAnd = (a > 0 && b > 0);
        boolean logicalOr = (a < 0 || b > 0);

        // Gabungkan semua hasil menjadi satu String
        // Gunakan '\n' untuk membuat baris baru
        String result = "Sum: " + sum + "\n" +
                        "Product: " + product + "\n" +
                        "Is Equal: " + isEqual + "\n" +
                        "Logical AND: " + logicalAnd + "\n" +
                        "Logical OR: " + logicalOr;
        
        // Kembalikan hasil akhirnya
        return result; 
}
}
