package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 038");
        System.out.println("--------------------------------------------");
        int tigadlpn1 = input.nextInt();
        int tigadlpn2 = input.nextInt();

        for (int i = 1;i<=tigadlpn1;i++){
            System.out.println("");
            System.out.print("+");
            for (int j = 1;j<=tigadlpn2;j++){
                System.out.print("---+");
            }
            System.out.println("");
            System.out.print("|");
            for (int k = 1;k<=tigadlpn2;k++){
                if (i%2==1){
                    System.out.print(" X |");
                }else{
                    System.out.print(" O |");
                }
            }
        }
        System.out.println("");
        System.out.print("+");
        for (int l=1;l<=tigadlpn2;l++){
            System.out.print("---+");
        }
    }
}
