package day02_MyfirstProgram.src.day13_ForLoops;

import java.util.Scanner;

public class Homework_04 {
    public static void main(String[] args) {
        //Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın girdiği sayı dahil
        // 0 dan başlayarak kullanıcının girdiği sayıya kadar tek ve çift tamsayıların toplamını
        // ayrı ayrı ekrana yazdıran programı yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int girilenSayi= scan.nextInt();
        int toplam1=0;
        int toplam2=0;

        for (int i=0; i<=girilenSayi; i++){
           if(i%2==0) {  toplam1+=i;}
           else { toplam2+=i;  }
                    }
        System.out.println("Çift sayıların toplamı = "+toplam1);
        System.out.println("Tek sayıların toplamı = "+toplam2);












    }
    }

