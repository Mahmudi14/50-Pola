package TugasPraktikum;
import java.util.Scanner;

public class Nomor6Pola050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 050");
        System.out.println("--------------------------------------------");
        int z = input.nextInt();

        for (int i = 0; i < z; i++) {
            for (int j = 0; j < z - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 0; j < 2 * (i); j++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int j = 0; j < 2 * (z-i-1); j++) {
                System.out.print(" ");
            }
            System.out.println("/");
        }
    }}
