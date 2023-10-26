package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 022");
        System.out.println("--------------------------------------------");
        int duadua= input.nextInt();
        for (int i = 1;i<=duadua;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}
