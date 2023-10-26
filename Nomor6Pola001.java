package TugasPraktikum;
import java.util.Scanner;

public class Nomor6Pola001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 01");
        System.out.println("--------------------------------------------");
        int satu = input.nextInt();
        for (int i = 1; i <= satu; i++) {
            System.out.print(" * ");
        }
    }
}
