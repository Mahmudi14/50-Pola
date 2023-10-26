package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola032 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 032");
        System.out.println("--------------------------------------------");
        int tigadua = input.nextInt();
        System.out.print("+");
        for (int i = 1;i<=tigadua;i++){
            System.out.print("---+");
        }
        System.out.println(" ");
        System.out.print("|");
        for (int j = 1;j<=tigadua;j++){
            System.out.print(" X |");
        }
        System.out.println(" ");
        System.out.print("+");
        for (int k = 1;k<=tigadua;k++){
            System.out.print("---+");
        }

    }
}
