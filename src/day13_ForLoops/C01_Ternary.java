package day02_MyfirstProgram.src.day13_ForLoops;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /*
         kullanicidan pozitif bir tamsayi alin
         sayi cift ise "sayi cift"
         degilse "tek sayi" yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir pozitif sayı giriniz: " );
        int num= scan.nextInt();

        if (num%2==0){
            System.out.println("Sayı çift");
        }else{
            System.out.println("Sayı tek");
        }

        System.out.println("------------------------------------------------------");

        System.out.println(num%2==0? "Çift sayı":"Tek sayı");// Ternary bu şekilde yapılıyor!!!!
        String result = (num%2==0) ? "Çift sayı":"Tek sayı"; //Ya da bu şekilde
        System.out.println(result);



    }
}
