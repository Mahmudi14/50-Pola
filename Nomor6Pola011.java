package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 011");
        System.out.println("--------------------------------------------");
        int sbls = input.nextInt();
        for (int i = 1; i <= sbls - 1; i++) {
            for (int j = sbls; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= sbls; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
