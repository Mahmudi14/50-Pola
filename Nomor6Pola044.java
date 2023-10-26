package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 044");
        System.out.println("--------------------------------------------");
        int emptempt = input.nextInt();
        for (int i = 0; i < emptempt; i++) {
            for (int j = 0; j < (emptempt - i - 1); j++) {
                System.out.print("    ");
            }
            System.out.print("+");
            for (int k = 0; k <= i; k++) {
                System.out.print("---+");
            }
            System.out.println("");
            for (int l = 0; l < (emptempt-i-1);l++) {
                System.out.print("    ");
            }
            System.out.print("|");
            for (int m = 0;m<=i;m++){
                System.out.print("   |");
            }
            System.out.println("");
        }
        System.out.print("+");
        for (int j = 1;j<=emptempt;j++){
            System.out.print("---+");
        }
    }
}
