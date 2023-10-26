package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola039 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 039");
        System.out.println("--------------------------------------------");
        int tigasmbln1 = input.nextInt();
        int tigasmbln2 = input.nextInt();

        for (int i = 1;i<=tigasmbln1;i++){
            System.out.println("");
            System.out.print("+");
            for (int j = 1;j<=tigasmbln2;j++){
                System.out.print("---+");
            }
            System.out.println("");
            System.out.print("|");
            for (int k = 1;k<=tigasmbln2;k++){
                if (i%2==1){
                    if (k%2==1){
                        System.out.print(" X |");
                    }else{
                        System.out.print(" O |");
                    }
                }else{
                    if (k%2==1){
                        System.out.print(" O |");
                    }else{
                        System.out.print(" X |");
                }
            }
        }
        System.out.println("");
        System.out.print("+");
        for (int l=1;l<=tigasmbln2;l++){
            System.out.print("---+");
        }
    }
}}
