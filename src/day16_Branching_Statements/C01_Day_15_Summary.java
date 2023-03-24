package day02_MyfirstProgram.src.day16_Branching_Statements;

import java.util.Scanner;

public class C01_Day_15_Summary {
    public static void main(String[] args) {
      /*  int taban = 5;
        int kuvvet = 5;

        int result = 1;

        for (int i = 0; i < kuvvet; i++) {

            result *= taban;
        }
        if (taban==0&&kuvvet==0){
            System.out.println("Tanımsız");
        }else{
            System.out.println(result);
        }

        System.out.println("--------------------------------------");

        //Piramit

        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");

            }
            for (int k = 6-i; k >0 ; k--) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println("---------------------------------------");*/
        Scanner scan=new Scanner(System.in);

       boolean flag=true;

       while (flag){
           System.out.print("x: ");
           int x= scan.nextInt();
           System.out.print("y: ");
           int y= scan.nextInt();
           int result=x+y;
           if (result>=25){
               flag=false;
               System.out.println("Toplam 25'e eşit veya büyük olduğu için programdan çıkılıyor.");
           }else{
               System.out.println("Toplam: "+result);
           }
       }


    }
}
