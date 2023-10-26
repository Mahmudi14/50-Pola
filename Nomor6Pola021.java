package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 021");
        System.out.println("--------------------------------------------");
        int duastu= input.nextInt();
        for (int i = 1;i<=duastu;i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for (int i = 1;i<=duastu;i++){
            for (int j =2 ;j<=i+1;j++){
                System.out.print("   ");
            }
            for (int k = duastu-1;k>=i;k--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
