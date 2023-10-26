package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola037 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 037");
        System.out.println("--------------------------------------------");
        int tigatjh1 = input.nextInt();
        int tigatjh2 = input.nextInt();

        for (int i = 1;i<=tigatjh1;i++){
            System.out.println("");
            System.out.print("+");
            for (int j = 1;j<=tigatjh2;j++){
                System.out.print("---+");
            }
            System.out.println("");
            System.out.print("|");
            for (int k = 1;k<=tigatjh2;k++){
                if (k%2==1){
                    System.out.print(" X |");
                }else{
                    System.out.print(" O |");
                }
            }
        }
        System.out.println("");
        System.out.print("+");
        for (int l=1;l<=tigatjh2;l++){
            System.out.print("---+");
        }
    }
}
