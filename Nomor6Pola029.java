package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola029 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 029");
        System.out.println("--------------------------------------------");
        int duasmbln1= input.nextInt();
        int duasmbln2=input.nextInt();
        for (int i =1;i<=duasmbln1;i++){
            for (int j = 1;j<=duasmbln2;j++){
                if (i>1 && i<duasmbln1){
                    if (j>1 && j<duasmbln2){
                        System.out.print(". ");
                    }else{
                        System.out.print("* ");
                    }
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
    }
}
