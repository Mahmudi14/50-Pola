package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola028 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 028");
        System.out.println("--------------------------------------------");
        int duadlpn1= input.nextInt();
        int duadlpn2= input.nextInt();
        for (int i =1;i<=duadlpn1;i++){
            for (int j = 1;j<=duadlpn2;j++){
                if (i>1 && i<duadlpn1){
                    if (j>1 && j<duadlpn2){
                        System.out.print(" ~ ");
                    }else{
                        System.out.print(" + ");
                    }
                }else {
                    System.out.print(" + ");
                }
            }
            System.out.println(" ");
        }
    }
}
