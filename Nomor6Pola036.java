package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola036 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 036");
        System.out.println("--------------------------------------------");
        int tigaenm1 = input.nextInt();
        int tigaenm2 = input.nextInt();

        for (int i = 1;i<=tigaenm1;i++){
            System.out.println("");
            System.out.print("+");
            for (int j = 1;j<=tigaenm2;j++){
                System.out.print("---+");
            }
            System.out.println("");
            System.out.print("|");
            for (int k = 1;k<=tigaenm2;k++){
                System.out.print(" X |");
            }
        }
        System.out.println("");
        System.out.print("+");
        for (int l=1;l<=tigaenm2;l++){
            System.out.print("---+");
        }
    }
}
