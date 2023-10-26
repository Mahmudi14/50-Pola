package TugasPraktikum;
import java.util.Scanner;

public class Nomor6Pola045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 045");
        System.out.println("--------------------------------------------");
        int emptlima = input.nextInt();
        System.out.print("+");
        for (int i = 0;i<emptlima;i++){
            System.out.print("---+");
        }
        System.out.println("");

        for(int i=0;i<emptlima;i++){
            for (int j = 0;j<i;j++){
                System.out.print("    ");
            }
            System.out.print("|");
            for (int k = 0;k<(emptlima-i);k++){
                System.out.print("   |");
            }
            System.out.println("");
            for (int l = 0;l<i;l++){
                System.out.print("    ");
            }
            System.out.print("+");
            for (int m = 0;m<(emptlima-i);m++){
                System.out.print("---+");
            }
            System.out.println();
        }


    }
}
