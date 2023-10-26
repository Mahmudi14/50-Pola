package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 008");
        System.out.println("--------------------------------------------");
        int dlpn = input.nextInt();
        for (int  i =0;i<dlpn;i++){
            for(int j =dlpn-1;j>i;j--){
                System.out.print(" ");
            }
            for (int k =0;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
