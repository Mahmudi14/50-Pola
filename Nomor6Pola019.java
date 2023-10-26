package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 019");
        System.out.println("--------------------------------------------");
        int smblnbls = input.nextInt();
        for (int i = 1;i<=smblnbls-1;i++){
            for (int j = 1;j<=smblnbls-1;j++){
                if (j==i){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }

            }
            for (int k=smblnbls;k>=i;k--){
                if (k==i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 1;i<=smblnbls;i++){
            for (int j = smblnbls;j>=i;j--){
                if (j==i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }for (int k = 2;k<=i;k++){
                System.out.print("   ");
            }
            for (int l = 2;l<=i;l++){
                if (l==i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }
}
