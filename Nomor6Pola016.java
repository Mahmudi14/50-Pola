package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 016");
        System.out.println("--------------------------------------------");
        int enmbls = input.nextInt();
        for (int i=1;i<=enmbls;i++){
            for (int j = enmbls;j>=i;j--){
                System.out.print("  ");
            }
            System.out.print(" * ");
            System.out.println(" ");
        }
    }
}
