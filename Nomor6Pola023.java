package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 023");
        System.out.println("--------------------------------------------");
        int duatiga= input.nextInt();
        for (int i = 1 ;i<=duatiga;i++) {
            for (int j = 1; j <= duatiga; j++) {
                System.out.print(" + ");
            }
            System.out.println(" ");
        }
    }
}
