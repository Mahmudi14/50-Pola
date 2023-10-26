package TugasPraktikum;
import java.util.Scanner;

public class Nomor6Pola034 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 034");
        System.out.println("--------------------------------------------");
        String tigatiga = input.next();
        int panjang = tigatiga.length();
        System.out.print("+");
        for (int i=1;i<=panjang;i++){
            System.out.print("---+");
        }
        System.out.println("");
        System.out.print("|");
        for (int j=0;j<=panjang-1;j++){
            int nilai = Integer.parseInt(String.valueOf(tigatiga.charAt(j)));
            if (nilai%2==1){
                System.out.print(" X |");
            }else {
                System.out.print(" O |");
            }
        }
        System.out.println("");
        System.out.print("+");
        for (int k=1;k<=panjang;k++){
            System.out.print("---+");
        }

    }
}
