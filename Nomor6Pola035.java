package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola035 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 035");
        System.out.println("--------------------------------------------");
        int tigalm1 = input.nextInt();
        int tigalm2 = input.nextInt();

        for (int i = 1;i<=tigalm1;i++){
            System.out.println("");
            System.out.print("+");
            for (int j = 1;j<=tigalm2;j++){
                System.out.print("---+");
            }
            System.out.println("");
            System.out.print("|");
            for (int k = 1;k<=tigalm2;k++){
                System.out.print("   |");
            }
        }
        System.out.println("");
        System.out.print("+");
        for (int l=1;l<=tigalm2;l++){
            System.out.print("---+");
        }

    }
}
