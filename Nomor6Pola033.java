package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola033 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 033");
        System.out.println("--------------------------------------------");
        int tigatiga = input.nextInt();
        System.out.print("+");
        for (int i = 1;i<=tigatiga;i++){
            System.out.print("---+");
        }
        System.out.println(" ");
        System.out.print("|");
        for (int j =1 ;j<=tigatiga;j++){
            if (j%2==1){
                System.out.print(" x |");
            }else {
                System.out.print(" O |");
            }
        }
        System.out.println(" ");
        System.out.print("+");
        for (int k =1;k<=tigatiga;k++){
            System.out.print("---+");
        }
    }
}
