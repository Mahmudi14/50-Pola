package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 010");
        System.out.println("--------------------------------------------");
        int sepuluh = input.nextInt();
        for (int i = 1; i <= sepuluh; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= sepuluh; i++) {
            for (int j = sepuluh - 1; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}

