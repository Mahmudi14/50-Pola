package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola040 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 040");
        System.out.println("--------------------------------------------");
        System.out.print("Rows : ");
        int emptplh1 = input.nextInt();
        System.out.print("Cols : ");
        int emptplh2 = input.nextInt();
        String [] data = new String[emptplh1];
        for (int i =0;i<emptplh1;i++){
            data[i]= input.next();
        }
        for (int i = 0;i<emptplh1;i++){
            System.out.println("");
            System.out.print("+");
            for (int j=1;j<=emptplh2;j++){
                System.out.print("---+");
            }
            System.out.println("");
            System.out.print("|");
            for (int k=0;k<emptplh2;k++){
                int isi = Integer.parseInt(String.valueOf(data[i].charAt(k)));
                if (isi%2==1){
                    System.out.print(" X |");
                }else{
                    System.out.print(" O |");
                }
            }
            }
            System.out.println("");
            System.out.print("+");
            for (int l = 1;l<=emptplh2;l++){
                System.out.print("---+");
        }


    }
}
