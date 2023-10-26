package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola030 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 030");
        System.out.println("--------------------------------------------");
        int tigaplh1= input.nextInt();
        int tigaplh2=input.nextInt();
        for (int i =1;i<=tigaplh1;i++){
            for (int j = 1;j<=tigaplh2;j++){
                if (i>1 && i<tigaplh1){
                    if (j>1 && j<tigaplh2){
                        System.out.print("- ");
                    }else{
                        System.out.print("+ ");
                    }
                }else {
                    System.out.print("+ ");
                }
            }
            System.out.println(" ");
        }
    }
}
