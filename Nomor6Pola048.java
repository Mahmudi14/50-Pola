package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola048 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 048  ");
        System.out.println("--------------------------------------------");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print("+");
        for (int i=0;i<b;i++){
            System.out.print("---+");
        }
        System.out.println("");
        for (int i = 0;i<a;i++){
            System.out.print("|");
            for (int j = 0;j<b-1;j++){
                System.out.print("    ");
            }
            System.out.println("   |");
            if (i<b-1){
                System.out.print("+");
                for (int k =0 ;k<a-1;k++){
                    System.out.print("     ");
                }
                System.out.println("     +");
            }
        }
        System.out.print("+");
        for (int i=0;i<b;i++){
            System.out.print("---+");
        }
        System.out.println("");
    }
}
