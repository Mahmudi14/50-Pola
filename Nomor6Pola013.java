package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 013");
        System.out.println("--------------------------------------------");
        int tgbls = input.nextInt();
        for (int i = 1;i<=tgbls-1;i++){
            for (int j = 2;j<=i;j++){
                System.out.print("   ");
            }
            for (int k =tgbls;k>=i;k--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for (int i = 1;i<=tgbls;i++){
            for (int j = tgbls;j>i;j--){
                System.out.print("   ");
            }
            for (int k = 1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
