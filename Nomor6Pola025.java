package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola025 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 025");
        System.out.println("--------------------------------------------");
        int dualm1= input.nextInt();
        int dualm2= input.nextInt();
        for (int i = 1;i<=dualm1;i++){
            for (int j=1;j<=dualm2;j++){
                if (j%2==1){
                    System.out.print(" + ");
                }else {
                    System.out.print(" = ");
                }
            }
            System.out.println(" ");
        }
    }
}
