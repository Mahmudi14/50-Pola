package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 014");
        System.out.println("--------------------------------------------");
        int emptbls = input.nextInt();
        for (int  i =0;i<emptbls-1;i++){
            for(int j =emptbls-1;j>i;j--){
                System.out.print(" ");
            }
            for (int k =0;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 0;i<emptbls;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int k = emptbls;k>i;k--){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
