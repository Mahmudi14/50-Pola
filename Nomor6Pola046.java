package TugasPraktikum;
import java.util.Scanner;

public class Nomor6Pola046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 046");
        System.out.println("--------------------------------------------");
        System.out.print("Rows : ");
        int emptenm = input.nextInt();
        String [] data = new String[emptenm];
        for (int i =0 ;i<emptenm;i++){
            data[i] = input.next();
        }
        int max = 0;
        for (int i = 0;i<emptenm;i++){
            int panjang = data[i].length();
            max = Math.max(max,panjang);

            System.out.print("+");
            for (int j = 0;j < max;j++){
                System.out.print("---+");
            }
            System.out.println("");
            System.out.print("|");
            for (int k = 0;k<panjang;k++){
                int isi = Integer.parseInt(String.valueOf(data[i].charAt(k)));
                if (isi == 0){
                    System.out.print(" O |");
                }else if (isi == 1){
                    System.out.print(" X |");
                }
            }
            System.out.println("");
            max=panjang;
        }
        System.out.print("+");
        for (int i=0;i<max;i++){
            System.out.print("---+");
        }
        System.out.println("");

    }
}
