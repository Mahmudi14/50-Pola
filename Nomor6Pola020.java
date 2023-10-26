package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 020");
        System.out.println("--------------------------------------------");
        int duaplh= input.nextInt();
        for (int i=1;i<=duaplh;i++){
            for (int j=duaplh;j>=i+1;j--){
                System.out.print("   ");
            }
            for (int k = 1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for (int i=1;i<=duaplh;i++){
            for (int j = duaplh-1 ;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
