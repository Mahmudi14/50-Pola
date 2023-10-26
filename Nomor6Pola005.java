package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola005 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 05");
        System.out.println("--------------------------------------------");
        int lima = input.nextInt();
        for (int i = 1; i <= lima; i++) {
            for (int j = lima; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
