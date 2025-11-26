package Jobsheet10;

import java.util.Arrays;

public class Numbers20 {
   public static void main(String[] args) {
    int [][] MyNumbers = new int [3][];
    MyNumbers [0] = new int[5];
    MyNumbers [1] = new int[3];
    MyNumbers [2] = new int[1];

    for (int i = 0; i < MyNumbers.length; i++) {
            System.out.println(Arrays.toString(MyNumbers[i]));
    }
    for (int i = 0; i < MyNumbers.length; i++) {
    System.out.println("Panjang baris ke-" + (i + 1) + ": " + MyNumbers[i].length);
   }
   } 
}
