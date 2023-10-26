package TugasPraktikum;

import java.util.Scanner;

public class Nomor6Pola027 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("POLA 027");
        System.out.println("--------------------------------------------");
        int duatjh1= input.nextInt();
        int duatjh2= input.nextInt();
        for (int i =1;i<=duatjh1;i++){
            for (int j = 1;j<=duatjh2;j++){
                if (i%2==1){
                    if (j%2==1){
                        System.out.print(" + ");
                    }else{
                        System.out.print(" = ");
                    }
                }else {
                    if (j%2==1){
                        System.out.print(" = ");
                    }else {
                        System.out.print(" + ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}
