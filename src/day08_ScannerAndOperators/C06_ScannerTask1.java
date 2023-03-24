package day02_MyfirstProgram.src.day08_ScannerAndOperators;

import java.util.Scanner;

public class C06_ScannerTask1 {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı alın
        //Sayının karesini alın konsola yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin");

        int girilenSayi = scan.nextInt();

        System.out.println("Girilen sayı = "+girilenSayi);
        System.out.println("Girilen sayının karesi = "+girilenSayi*girilenSayi);
        scan.close();


    }
}
