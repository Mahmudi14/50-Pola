package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 018");
        System.out.println("--------------------------------------------");
        int dlpnbls= input.nextInt();
        for (int i = 1;i<=dlpnbls;i++){
            for (int j = dlpnbls;j>=i;j--){
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
