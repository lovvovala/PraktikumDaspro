package UTS;
import java.util.Scanner;
public class BMI20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menginput berat dan tinggi badan
        System.out.println("=== KALKULATOR BMI (BODY MASS INDEX) ===");
        System.out.print("Berat badan (kg)\t: ");
        double berat = sc.nextDouble();
        System.out.print("Tinggi Badan (cm)\t: ");
        double tinggi = sc.nextDouble();

        //Menghitung BMI
        double BMI, TINGGI2;
        TINGGI2 = tinggi / 100; // ubah cm ke meter
        BMI = berat/(TINGGI2*TINGGI2);
        String hasilBMI = String.format("%.1f", BMI);
        System.out.println("Nilai BMI Anda\t: " + hasilBMI);

        // Kategori BMI
        String kategori, risiko;

        if (BMI < 18.5) {
            kategori = "Kurang berat badan (Underweight)";
            risiko = "Kekurangan gizi, osteoporosis, penurunan sistem kekebalan tubuh.";
        } else if (BMI < 25) {
            kategori = "Berat badan normal (Normal weight)";
            risiko = "Relatif rendah.";
        } else if (BMI < 30) {
            kategori = "Kelebihan berat badan (Overweight)";
            risiko = "Meningkatnya risiko penyakit jantung, diabetes, tekanan darah tinggi.";
        } else {
            kategori = "Obesitas (Obese)";
            risiko = "Risiko tinggi penyakit jantung, diabetes, tekanan darah tinggi, masalah pernapasan, dan beberapa jenis kanker.";
        }

        // Tampilkan hasil
        System.out.println("=== HASIL ANALISIS BMI ===");
        System.out.println("Kategori BMI\t: " + kategori);
        System.out.println("Risiko Kesehatan\t: " + risiko);
        
    }
}
