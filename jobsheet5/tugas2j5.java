package jobsheet5;
import java.util.Scanner;
public class tugas2j5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan angka: ");
        angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }

        input.close();
    }
}

