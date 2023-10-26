package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 07");
        System.out.println("--------------------------------------------");
        int tujuh = input.nextInt();
        for (int i = 1; i <= tujuh; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print("   ");
            }
            for (int k = tujuh; k >= i; k--) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
