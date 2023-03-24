package day02_MyfirstProgram.src.day13_ForLoops;

import java.util.Scanner;

public class Homework_05 {
    public static void main(String[] args) {
        //Kullanıcıdan taban ve kuvvet bilgilerini alarak ekrana sonucu
        // yazdıran programı yazdırınız.(2 üzeri 4 =16)

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int girilenSayi = scan.nextInt();

        System.out.print("Lütfen sayının kuvvetini giriniz: ");
        int kuvvet = scan.nextInt();
        int total = girilenSayi;

        for (int i = 2; i <= kuvvet; i++) {
            total *= girilenSayi;
        }
        System.out.println(girilenSayi + " üzeri " + kuvvet + " = " + total);
    }
}
