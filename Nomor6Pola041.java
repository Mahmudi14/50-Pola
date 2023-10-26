package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola041 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 041");
        System.out.println("--------------------------------------------");
        int emptstu = input.nextInt();
        for (int i = 1;i<=emptstu;i++){
            System.out.print("+");
            for (int j = 1;j<=i;j++){
                System.out.print("---+");
            }
            System.out.println("");
            System.out.print("|");
            for (int k = 1;k<=i;k++){
                System.out.print("   |");
            }
            System.out.println("");
        }
        System.out.print("+");
        for (int i = 1;i<=emptstu;i++){
            System.out.print("---+");
        }
    }
}
