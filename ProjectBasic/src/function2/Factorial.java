package function2;

public class Factorial {
    // Method rekursif untuk menghitung faktorial
    public int factorial(int n) {
        
        // Pertama, Kasus Dasar (Base Case): Kondisi untuk berhenti.
        // Jika n adalah 0, sesuai aturan, faktorialnya adalah 1.
        if (n == 0) {
            return 1;
        } 
        // Kedua,Langkah Rekursif (Recursive Step): Fungsi memanggil dirinya sendiri.
        // Jika n bukan 0, kalikan n dengan hasil faktorial dari (n-1).
        else {
            return n * factorial(n - 1);
        }
    }
}
