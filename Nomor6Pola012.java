package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 012");
        System.out.println("--------------------------------------------");
        int dbls = input.nextInt();
        for (int i = 1; i <= dbls; i++) {
            for (int j = dbls; j > i; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= dbls; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (int k = dbls - 1; k >= i; k--) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

}
