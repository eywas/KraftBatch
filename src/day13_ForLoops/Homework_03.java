package day02_MyfirstProgram.src.day13_ForLoops;

import java.util.Scanner;

public class Homework_03 {
    public static void main(String[] args) {
        //Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcının girdiği sayı dahil
        // 0 dan başlayarak kullanıcının girdiği sayıya kadar olan tamsayıların toplamını
        // ekrana yazdıran programı yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 0 ile 1000 arasında bir sayı giriniz: ");
        int girilenSayi= scan.nextInt();
        int toplam=0;

        for (int i=0; i<=girilenSayi; i++){
            toplam+=i;
                    }
        System.out.println("Toplam = "+toplam);



    }
    }

