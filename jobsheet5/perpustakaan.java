package PraktikumDaspro.jobsheet5;
import java.util.Scanner;
public class perpustakaan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    

    System.out.print("Kartu Mahasiswa : ");
    String kartu = sc.nextLine();
    System.out.print("Registrasi online : ");
    String regisOnline = sc.nextLine();

    if (kartu.equalsIgnoreCase("bawa") || regisOnline.equalsIgnoreCase("sudah")) {
        System.out.println("Diperbolehkan Masuk");
    } else {
        System.out.println("Ditolak Masuk");
    }

  }  
}
    

