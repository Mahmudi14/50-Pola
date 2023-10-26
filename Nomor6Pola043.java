package TugasPraktikum;
import java.util.Scanner;

public class Nomor6Pola043 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 043");
        System.out.println("--------------------------------------------");
        int empttga = input.nextInt();

        System.out.print("+");
        for (int j = 1; j <= empttga; j++) {
            System.out.print("---+");
        }
            for (int i = 1; i <= empttga; i++) {

                System.out.println("");
                System.out.print("|");
                for (int k =empttga; k>= i; k--) {
                    System.out.print("   |");
                }
                System.out.println("");
                System.out.print("+");
                for (int l = 0;l<=(empttga-i);l++){
                    System.out.print("---+");
                }
            }


        }
    }
