package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola026 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 026");
        System.out.println("--------------------------------------------");
        int duaenm1= input.nextInt();
        int duaenm2= input.nextInt();
        for (int i = 1;i<=duaenm1;i++){
            for (int j = 1;j<=duaenm2;j++){
                if (i%2==1){
                    System.out.print(" + ");
                }else {
                    System.out.print(" = ");
                }
            }
            System.out.println(" ");
        }
    }
}
