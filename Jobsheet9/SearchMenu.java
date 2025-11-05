package Jobsheet9;
import java.util.Scanner;
public class SearchMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        System.out.println("=== MENU KAFE ===");
        for (String m : menu) {
            System.out.println("- " + m);
        }
        
        System.out.println("==========================================");
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String key = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])) {
                ditemukan = true; 
            }
        }

        System.out.println("==========================================");
        if (ditemukan) {
            System.out.println("Hasil: " + key + " tersedia di menu."); // [cite: 261]
        } else {
            System.out.println("Hasil: " + key + " tidak ada di menu."); // [cite: 262]
        }
        
    }
}
