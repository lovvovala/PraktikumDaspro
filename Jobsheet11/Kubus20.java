package Jobsheet11;
import java.util.Scanner;
public class Kubus20 {
    static int hitungLuasPermukaan(int sisi) {
        int LuasPermukaan= (sisi * sisi )* 6;
        return LuasPermukaan;
    }

    static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int s,Lp, vol;
        
        System.out.print("Masukkan sisi kubus: ");
        s = input.nextInt();
        
        Lp = hitungLuasPermukaan(s);
        System.out.println("Luas Permukaan Kubus adalah " + Lp);
        
        vol = hitungVolume(s);
        System.out.println("Volume Kubus adalah " + vol);
        
        input.close();
    }

}
