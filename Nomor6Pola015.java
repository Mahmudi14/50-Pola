package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 015");
        System.out.println("--------------------------------------------");
        int lmbls = input.nextInt();
        for (int i = 1 ;i<=lmbls;i++){
            for (int j = 1;j<=i;j++) {
                if (j == i) {
                    System.out.print(" * ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");


        }
    }
}
