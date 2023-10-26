package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 017");
        System.out.println("--------------------------------------------");
        int tjhbls = input.nextInt();
        for (int i = 1;i<=tjhbls;i++){
            for (int j = 1;j<=tjhbls-1;j++){
                if (j==i){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }

            }
            for (int k=tjhbls;k>=i;k--){
                if (k==i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }
}
