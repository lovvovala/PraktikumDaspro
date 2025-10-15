package jobsheet5.UTS;
import java.util.Scanner;
public class Terbesar20 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Menginput angka
    System.out.println("+++ MENNETUKKAN ANGKA TERBESAR ++++");
    System.out.print("Bilangan Pertama : ");
    int a = input.nextInt();
    System.out.print("Bilangan Kedua : ");
    int b = input.nextInt();
    System.out.print("Bilangan Ketiga : ");
    int c = input.nextInt();

    // Menentukan bilangan terbesar dan yang sama besar
   if (a > b && a > c) {
            System.out.println("Bilangan terbesar adalah = " + a);
        } else if (b > a && b > c) {
            System.out.println("Bilangan terbesar adalah = " + b);
        } else if (c > a && c > b) {
            System.out.println("Bilangan terbesar adalah = " + c);
        } else {
            // kalau masuk sini berarti ada angka yang sama
            if (a == b && b == c) {
                System.out.println("Ketiga bilangan sama BESAR");
            } else if (a == b) {
                System.out.println("Ada dua bilangan terbesar yaitu " + a + " dan " + b);
            } else if (a == c) {
                System.out.println("Ada dua bilangan terbesar yaitu " + a + " dan " + c);
            } else if (b == c) {
                System.out.println("Ada dua bilangan terbesar yaitu " + b + " dan " + c);
            }
        } 
  }  
}
