package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 09");
        System.out.println("--------------------------------------------");
        int smbln = input.nextInt();
        for (int i = 0;i<smbln;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int k = smbln;k>i;k--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
