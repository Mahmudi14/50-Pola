package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 06");
        System.out.println("--------------------------------------------");
        int enam = input.nextInt();
        for (int i = 1; i <= enam; i++) {
            for (int j = enam; j > i; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
