package day02_MyfirstProgram.src.day15_If_Else_SWitch_Loops_Summary;

import java.util.Scanner;

public class C05_For_loops {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        //kullanıcının 3 hakkı olsun şifre girsin
        Scanner scan=new Scanner(System.in);
        int sifre=56;

        System.out.println("şifre nedir 3 hakkınız var");

        int i=0;
        while (i<3){
            System.out.println("Şifre");
            int tahmin= scan.nextInt();
            if (sifre==tahmin){
                System.out.println("Şifre doğru");
                break;
            }else{
                System.out.println("Şifre yanlış");
            }
           i++;
        }
    }
}
