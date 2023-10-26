package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola031 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 031");
        System.out.println("--------------------------------------------");
        int tigastu = input.nextInt();
        System.out.print("+");
        for (int i = 1;i<=tigastu;i++){
            System.out.print("---+");
        }
        System.out.println(" ");
        System.out.print("|");
        for (int j = 1;j<=tigastu;j++){
            System.out.print("   |");
        }
        System.out.println(" ");
        System.out.print("+");
        for (int k = 1;k<=tigastu;k++){
            System.out.print("---+");
        }

    }
}
