package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 04");
        System.out.println("--------------------------------------------");
        int empat = input.nextInt();
        for (int i = 1; i <= empat; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
