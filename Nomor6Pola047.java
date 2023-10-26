package TugasPraktikum;
import java.util.Scanner;

public class Nomor6Pola047 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 048");
        System.out.println("--------------------------------------------");
        int emptdlpn = input.nextInt();
        System.out.print("+");
        for (int i = 0 ;i<emptdlpn;i++){
            System.out.print("---+");
        }
        System.out.println("");
        for (int i =0;i<emptdlpn;i++){
            System.out.print("|");
            for (int k = 0;k<emptdlpn-1;k++){
                System.out.print("    ");
            }
            System.out.println("   |");
            if (i<emptdlpn-1){
                System.out.print("+");
                for (int k = 0;k<emptdlpn-1;k++){
                    System.out.print("    ");
                }
                System.out.println("   +");
            }
        }
        System.out.print("+");
        for (int j=0;j<emptdlpn;j++){
            System.out.print("---+");
        }
        System.out.println("");
        }
    }

