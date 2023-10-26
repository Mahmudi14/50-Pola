package TugasPraktikum;
import java.util.Scanner;

public class Nomor6Pola042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 042");
        System.out.println("--------------------------------------------");
        System.out.print("Rows : ");
        int emptdua  = input.nextInt();
        int [] banyak = new int [emptdua];
        for (int i = 0;i<emptdua;i++){
            banyak[i]=input.nextInt();
        }
        int max = 0;
        for (int i = 0;i<emptdua;i++){
            int anu = banyak[i];
            max = Math.max(max,anu);
            System.out.print("+");
            for (int j = 0 ;j<max;j++){
                System.out.print("---+");
            }
            System.out.println("");
            System.out.print("|");
            for (int k=0;k<anu ;k++){
                System.out.print("   |");
            }
            System.out.println("  ");
        }
        System.out.print("+");
        for (int i=1;i<=max;i++){
            System.out.print("---+");
        }
    }
}
