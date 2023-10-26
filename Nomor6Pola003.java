package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 03");
        System.out.println("--------------------------------------------");
        int turun = input.nextInt();
        int samping = input.nextInt();
        for (int i = 1; i <= turun; i++) {
            for (int j = 1; j <= samping; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
