package TugasPraktikum;
import java.util.Scanner;

public class Nomor6Pola049 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 049");
        System.out.println("--------------------------------------------");
        int x = input.nextInt();
        int y = input.nextInt();

        for (int i = 0;i<x;i++){
            for (int j = 0;j<y;j++){
                System.out.print("/\\");
            }
            System.out.println("");
            for (int k = 0;k<y;k++){
                System.out.print("\\/");
            }
            System.out.println("");
        }
    }
}
