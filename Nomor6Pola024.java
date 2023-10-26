package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 024");
        System.out.println("--------------------------------------------");
        int duaempt1= input.nextInt();
        int duaempt2= input.nextInt();
        for (int i = 1;i<=duaempt1;i++){
            for (int j = 1;j<=duaempt2;j++){
                System.out.print(" + ");
            }
            System.out.println(" ");
        }
    }
}
