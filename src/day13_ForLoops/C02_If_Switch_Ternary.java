package day02_MyfirstProgram.src.day13_ForLoops;

import java.util.Scanner;

public class C02_If_Switch_Ternary {
    public static void main(String[] args) {
        /* Kullanicidan bir harf isteyin
         o harfle baslayan gun ismi varsa yazdirin
         yoksa "gecersiz harf" yazdirin*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");
        char harf = scan.next().charAt(0);// Bu sayede yazılan kelimenin ilk harfini alıyoruz
        //scanner sınıfı ile harf alamıyoruz. scan.next().charAt(0) ile ilk harfi alabiliyoruz

        if (harf == 'p' || harf == 'P') {
            System.out.println("Pazar, Pazartesi, Perşembe");
        } else if (harf == 's' || harf == 'S') {
            System.out.println("Salı");
        } else if (harf == 'c' || harf == 'C') {
            System.out.println("Çarşamba, Cuma, Cumartesi");
        } else {
            System.out.println("Geçersiz harf");
        }


        System.out.println("-------------------------------------------");

        switch (harf) {
            case 'p', 'P':
                System.out.println("Pazar, Pazartesi, Perşembe");
                break;
            case 's', 'S':
                System.out.println("Salı");
                break;
            case 'c':
            case 'C':
                System.out.println("Çarşamba, Cuma, Cumartesi");
                break;
            default:
                System.out.println("Geçersiz harf");

        }

        System.out.println("-------------------------------------------");
        // ternary (condition) ? (return if true) : (return if false);

        String result = (harf == 'p' || harf == 'P') ? "Pazar, Pazartesi, Perşembe" : (harf == 's' || harf == 'S') ? "Salı"
                : (harf == 'c' || harf == 'C') ? "Çarşamba, Cuma, Cumartesi" : "Geçersiz Harf";
        System.out.println(result);


    }
}

